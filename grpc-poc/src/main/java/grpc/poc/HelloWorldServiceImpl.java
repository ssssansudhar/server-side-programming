package grpc.poc;

import io.grpc.stub.StreamObserver;

public class HelloWorldServiceImpl extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {

    @Override
    public void getGreeting(Name request, StreamObserver<Greeting> responseObserver) {
        var response = Greeting.newBuilder().setGreet("Hello"+request.getName()+". Good morning. Hope you have a great day").build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
