
/**
 * When input is Alice or Bob it returns "Hello (their names respectivly)" any other names will show "I DON'T KNOW YOU, YOU ARE SCARY"
 *
 * @ Mike Ninh
 * @ 02/24/2021
 */
public class AliceAndBobEngine
{
    String result;
    
    AliceAndBobEngine(){
        result = "";
    }

    //HINT: LOOK AT THE TESTS TO SEE WHAT IS EXPECTED FOR DIFFERENT CONDITIONS
    public String evaluateAliceOrBob(String input)
    {
    if (input.equals("Alice")){
        result = "Hello Alice";
    } 
    else if (input.equals("Bob")){
        result = "Hello Bob";
    }
    else {
        result = "I DON'T KNOW YOU, YOU ARE SCARY";
    
    }
        return result;
    }
}
