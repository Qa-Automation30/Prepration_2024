package Git_Tutorial_RahulShetty.Section_5;

public class Video_11_12_13 {
    /**
     *  STAGING -> Working directory
     *  ------------------------------------------
     *   I made some changes in file. >> and add this file in staging area .[Can refer the Step_1.PNG]
     *   Now I realize I am not allowed to do changes in this file. >> Now what you need to do,
     *   either you have to remove your code or you can do it with git command as well.
     *
     *   so you need to fire one command -> "git reset" >> it will send back your changes into your working director
     *   from the staging. [Can refer the Step_2.PNG] , So iske baad "git status" karege to same files >> untrached me
     *   show hone lagegi.
     *   Note : Code kahi nai jayega local me likha hua, wo as it is wahi rahega.!!
     *
     *   "git reset" -> gets all changes moved from staging to working directory
     *
     */
    //==========================================================================
    /**
     *  Commit to Working director.
     *   =========
     *   Now suppose you made some changes and by mistake committed the code [refer the Step3.PNG]
     *   So now you want to move form commit to working directory >>
     *   need to put this command --> "git reset --soft HEAD~1" [Refer the Step_4.PNG]
     *
     *   So all the changes now in staging area.!!! [Step_5.PNG]
     */
    //==============================================================
    /**
     *  Hard reset vs Soft reset
     *  Command  --> "git reset --hard HEAD~1"
     *
     *   in hard reset it will revert the changes from commit and also remove the code from staging area.
     *   you would not be able to see the changes in your local as well, all would be removed. 
     *
     *
     *     
     */
    //Changes done by Master
    //changes done by master
}
