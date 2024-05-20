
public class Animal {

    String name;

    String type;

    String sound;



    Animal(String name,String type, String sound){

        this.name=name;
        this.type=type;
        this.sound=sound;
    }

    void attack () {
        System.out.println(name + " can eat");
    }
    void defend () {
        System.out.println(name + " can jump");
    }
    void dodge () {
        System.out.println(name + " can play");
    }
}

//comment
//hi animals


