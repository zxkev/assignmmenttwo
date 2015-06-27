package assignmenttwo;

/**
 * 
 * ITI 1221. Introduction to Computing II 
 *
 * @author Marcel Turcotte, University of Ottawa
 */

public class Calculator {

    private Stack operands;

    public Calculator() {
        operands = new ArrayStack( 100 );
    }

    public void execute( String program ) {
        Reader r = new Reader( program );

        while ( r.hasMoreTokens() ) {

            Token t = r.nextToken();

            if ( ! t.isSymbol() ) {

                operands.push( t );

            } else if ( t.sValue().equals( "add" ) ) {

                // implement this instruction

            } else if ( t.sValue().equals( "sub" ) ) {

                // implement this instruction

            } else if ( t.sValue().equals( "exch" ) ) {

                // implement this instruction

            } else if ( t.sValue().equals( "dup" ) ) {

                // implement this instruction

            } else if ( t.sValue().equals( "pstack" ) ) {

                // implement this instruction

            } else {

                System.out.println( "not a valid symbol" );

            }
        }
    }
}