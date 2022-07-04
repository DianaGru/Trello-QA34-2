package tests;

import models.Board;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BoardCreation extends TestBase{

    // @BeforeMethod
    //  public void  preConditions(){
    //     app.getUser().initLogin();
    //     app.getUser().fillLoginForm(User.builder().email("juliakliot.jk@gmail.com").password("misha240613").build());
    //     app.getUser().submitLogin();
    //  }


    @Test
    public void boardCreation1(){

        int boardCountBeforeCreation = app.getBoard().getBoardCount();

        Board board = new Board().setTitle("testQA34");

        app.getBoard().initBoardCreationFromHeader();
        app.getBoard().fillBoardCreationForm(board);
        app.getBoard().scrollDownTheForm();
        app.getBoard().pause(2000);
        app.getBoard().submitBoardCreation();
        app.getBoard().pause(2000);
        app.getBoard().returnToHomePage();

        int boardCountAfterCreation = app.getBoard().getBoardCount();

        Assert.assertEquals(boardCountAfterCreation, boardCountBeforeCreation+1);
    }
}
