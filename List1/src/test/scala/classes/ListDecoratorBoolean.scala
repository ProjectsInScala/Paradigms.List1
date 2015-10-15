package classes

class ListDecoratorBooleans extends ListDecorator{
  
    def isPalindrome (aBeforeMethodApplyLista:List[Int]):Boolean = 
      aBeforeMethodApplyLista == palindrome(aBeforeMethodApplyLista)
      
    def isSquared ( aLista:List[Int] ,aLista2:List[Int] ):Boolean = 
      sqrList(aLista) == aLista2
    
    def isProperListLength [A]( aLista : List[A] , aGoalLength : Int ) : Boolean = 
      listLength(aLista) == aGoalLength
      
    def isDuplicatedProperly [A] (aElement : A, aTimes : Int, aLista2 : List[A] ) : Boolean = 
      duplicate(aElement,aTimes) == aLista2
}