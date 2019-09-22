using System;

class Program{

	public static void Main(){
		Console.Write(Foo(""));
		Console.Read();
	}

	static bool Foo(string msg){
		if (msg.Length == 1) return true;
		if(!(msg[msg.Length-1].Equals(msg[0]))) return false;
		if(msg.Length == 2) return true;
		return Foo(msg.Substring(1, msg.Length-2));			
	}
}