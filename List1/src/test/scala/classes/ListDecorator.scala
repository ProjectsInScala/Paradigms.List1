package classes

class ListDecorator() {
  
  def palindrome [A](aLista:List[A]) =  aLista reverse
      
  def sqrList ( aLista:List[Int] ):List[Int] = 
		if (aLista==Nil) Nil
		else ( ( aLista head ) * ( aLista head ) )::sqrList(aLista tail)
		
	def listLength [A](aLista:List[A]):Int =
		if (aLista==Nil) 0
		else 1+listLength(aLista tail)
		
	def duplicate [A](aToReply:A,aCounter:Int):List[A] = 
		if (aCounter==0) Nil
		else aToReply::duplicate(aToReply,aCounter-1)
}