package ttt;

import junit.framework.TestCase;

public class ChooseMoveTest extends TestCase {
	
	public ChooseMoveTest(String arg0) {
		super(arg0);
	}
	
	public void test() {
		TicTacToe ttt = new TicTacToe();
		assertEquals(0, ttt.chooseMove());
		
		//Set player 1
		ttt.playMove(0);
		assertEquals(4, ttt.chooseMove());
		
		//Set player 2
		ttt.playMove(4);
		assertEquals(8, ttt.positionValue());

		//Set player 1
		ttt.playMove(8);
		assertEquals(3, ttt.positionValue());

		//Set player 2
		ttt.playMove(3);
		assertEquals(5, ttt.positionValue());

		//Set player 1
		ttt.playMove(5);
		assertEquals(2, ttt.positionValue());

		//Set player 2
		ttt.playMove(2);
		assertEquals(6, ttt.positionValue());

		//Set player 1
		ttt.playMove(6);
		assertEquals(7, ttt.positionValue());

		//Set player 2
		ttt.playMove(7);
		assertEquals(1, ttt.positionValue());
		

		//Set player 1
		ttt.playMove(1);
		
		//Board full
		

		TicTacToe ttt2 = new TicTacToe();
		
		//Set player 1
		ttt2.playMove(0);
		
		//Set player 2
		ttt2.playMove(4);
		assertEquals(8, ttt2.chooseMove());
		
		//Set player 1
		ttt2.playMove(8);
		
		//Set player 2
		ttt2.playMove(2);
		assertEquals(6, ttt2.chooseMove());	
		
		//Player 1 should always win in the next move
		
	}

}