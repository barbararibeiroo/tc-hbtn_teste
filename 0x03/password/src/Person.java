public class Person {

    public Person(){

    }
    public boolean checkUser(String loginUsuario){
        return !loginUsuario.contains("[,.@$^?~=+\\-_\\/*\\-+.\\|])).{8,]");
    }



    public boolean checkPassword(String senhaUsuario){
        return senhaUsuario.length() >= 8 && senhaUsuario.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*., ?]).+$");
    }

}
