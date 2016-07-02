class Demo1{

public static void main(String[] args){
  if(args != null && args.length > 0){
	String texto = "";
	for(String s: args){
		texto += s + " ";
	}
    System.out.println("Hola " + texto);
  } else
    System.out.println("Hola Todos.");
}

}