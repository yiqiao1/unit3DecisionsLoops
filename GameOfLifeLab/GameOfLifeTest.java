
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (x: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
         *  0 - - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  1 - - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  2 - - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  3 - - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  4 - - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  5 - - - - - x x x x x x  x  x  x  -  -  -  -  -
         *  6 - - - - - x x - - - -  -  x  x  -  -  -  -  -
         *  7 - - - - - x - x - - -  x  -  x  -  -  -  -  -
         *  8 - - - - - x - - x - x  -  -  x  -  -  -  -  -
         *  9 - - - - - x - - - x -  -  -  x  -  -  -  -  -
         *  10- - - - - x - - x - x  -  -  x  -  -  -  -  -
         *  11- - - - - x - x - - -  x  -  x  -  -  -  -  - 
         *  12- - - - - x x - - - -  -  x  x  -  -  -  -  -
         *  13- - - - - x x x x x x  x  x  x  -  -  -  -  -
         *  14- - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  15- - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  16- - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  17- - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  18- - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 5 && col == 5) ||
                        (row == 5 && col == 6) ||
                        (row == 5 && col == 7) ||
                        (row == 5 && col == 8) ||
                        (row == 5 && col == 9) ||
                        (row == 6 && col == 5) ||
                        (row == 7 && col == 5) ||
                        (row == 8 && col == 5) ||
                        (row == 9 && col == 5) ||
                        (row == 6 && col == 6) ||
                        (row == 7 && col == 7) ||
                        (row == 8 && col == 8) ||
                        (row == 9 && col == 9)
                        )
                        
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 3 generations         *  
         *
         * expected pattern for final state
         *  (x: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
         *  0 - - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  1 - - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  2 - - - - - - - - x x x  -  -  -  -  -  -  -  -
         *  3 - - - - - - - x x x x  x  -  -  -  -  -  -  - 
         *  4 - - - - - - x x x x x  x  x  -  -  -  -  -  -
         *  5 - - - - - x x x x x x  x  x  x  -  -  -  -  -
         *  6 - - - - x x x - - - -  -  x  x  x  -  -  -  -
         *  7 - - - x x x - x x x x  x  -  x  x  x  -  -  -
         *  8 - - x x x x - x - - -  x  -  x  x  x  x  -  -
         *  9 - - x x x x - x - - -  x  -  x  x  x  x  -  -
         *  10- - x x x x - x - - -  x  -  x  x  x  x  -  -
         *  11- - - x x x - x x x x  x  -  x  x  x  -  -  - 
         *  12- - - - x x x - - - -  -  x  x  x  -  -  -  -
         *  13- - - - - x x x x x x  x  x  x  -  -  -  -  -
         *  14- - - - - - x x x x x  x  x  -  -  -  -  -  -
         *  15- - - - - - - x x x x  x  -  -  -  -  -  -  -
         *  16- - - - - - - - x x x  -  -  -  -  -  -  -  -
         *  17- - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  18- - - - - - - - - - -  -  -  -  -  -  -  -  -
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 2 && col == 8) ||
                        (row == 2 && col == 9) ||
                        (row == 3 && col == 7) ||
                        (row == 3 && col == 8) ||
                        (row == 3 && col == 9) ||
                        (row == 4 && col == 6) ||
                        (row == 4 && col == 7) ||
                        (row == 4 && col == 8) ||
                        (row == 4 && col == 9) ||
                        (row == 5 && col == 5) ||
                        (row == 5 && col == 6) ||
                        (row == 5 && col == 7) ||
                        (row == 5 && col == 8) ||
                        (row == 5 && col == 9) ||
                        (row == 6 && col == 4) ||
                        (row == 6 && col == 5) ||
                        (row == 6 && col == 6) ||
                        (row == 7 && col == 3) ||
                        (row == 7 && col == 4) ||
                        (row == 7 && col == 5) ||
                        (row == 7 && col == 7) ||
                        (row == 7 && col == 8) ||
                        (row == 7 && col == 9) ||
                        (row == 8 && col == 2) ||
                        (row == 8 && col == 3) ||
                        (row == 8 && col == 4) ||
                        (row == 8 && col == 5) ||
                        (row == 8 && col == 7) ||
                        (row == 9 && col == 2) ||
                        (row == 9 && col == 3) ||
                        (row == 9 && col == 4) ||
                        (row == 9 && col == 5) ||
                        (row == 9 && col == 7)
                        )
                        
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
}

