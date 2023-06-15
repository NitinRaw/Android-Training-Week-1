
class Practice{

    /**
     *  lateinit can't be used on primitive data types linke Int,Float,Double, etc
     *  lateinit var abc : Int  ->  Compiler gives error
     *
     *  it also can't be used on nullable types  ( ? )
     *  lateinit var abc : String?  -> Compiler gives Error
     */

    lateinit var abc : String

    /** We can check if lateint var is initialized or not using IsInitialized method like
     *  and it will give false agr woh initialized nhi rhega otherwise true
     */



    fun checkingIfabcIsInitialised(){

        println("Is abc is initialized ?  : ${this::abc.isInitialized} ")

        abc = "Initialising abc"

        println("Is abc is initialized ?  : ${this::abc.isInitialized} ")



    }



}


fun main(){

    val obj = Practice()

    obj.checkingIfabcIsInitialised()


}

