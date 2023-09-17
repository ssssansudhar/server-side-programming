package grpc.poc;

import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class HelloWorldClient {


    private final HelloWorldServiceGrpc.HelloWorldServiceBlockingStub stub;

    public HelloWorldClient(Channel channel){
        stub = HelloWorldServiceGrpc.newBlockingStub(channel);
    }

    public static void main(String[] args) throws InterruptedException {
        var user = "Mike";
        var target = "localhost:50051";
        var channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create()).build();
        try {
            var client = new HelloWorldClient(channel);
            client.greet(user);
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }

    }

    public void greet(String name) {
        System.out.println("Will try to greet " + name + " ...");
        var request = Name.newBuilder().setName(name).build();
        Greeting response;
        try {
            response = stub.getGreeting(request);
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
            return;
        }
        System.out.println("Greeting: " + response.getGreet());
    }
}
