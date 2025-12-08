class Bird {
    public void fly (){ };
    public void hop (){ };
}

class Penguin extends Bird {
    @Override public void fly(){
        throw new RuntimeException("I cant fly");
    } 
}

// FIX

class FlyingBird {
    public void fly (){ };
    public void hop (){ };
}

class NonFlyBird {
    public void hop (){ };
}
class Penguin2 extends NonFlyBird {
}