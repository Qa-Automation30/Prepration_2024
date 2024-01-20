package Git_Tutorial_RahulShetty.Section_3;

public class Video_6_7_8 {
    /**
     *  // For better understanding follow the "Git State Mechanism_1.jpg"
     *
     *  Understand the GIT state mechanism ->
     *  1. First you have to clone the repo from BitBucket in your local system via >> git clone command
     *  2. Now you have made some changes in your local repo like add, update, delete file >>
     *     So your local repo become like a Working Directory  >> So the reason is when you do "git -status" and if it
     *     shows files in red color means that are untracked file(s) and it indicates that this is your
     *     working directory(can say local).
     *
     *  3. So if you want to push your local code to central repo, you need to follow some certain steps
     *     first you need to add those files which you want to push via "git add" command >> so it will move
     *     files from "working directory" to "staging Area".
     *
     *  4. Now commit your code via "git commit -m " command , because only committed code can be pushed into
     *     remote repo. (gitCommitCommand.PNG) >> Now it means some files are added to your local repo
     *
     *
     *  5. So imp point is that if you want to push the code onto Central Repo >> then your code should be on
     *  local repo, not to be on your working directory. So CentralRepo can only take the code from your local Repo
     *
     *  6. Now run "git push origin" >> it will push all the code to repo
     *
     */
    //============================================================================================

    /**
     * Now to understand the diff b/w "CLONE" and  "PULL"  -->
     *
     *  Clone is basically for once you do not have any local repo at all. (So this will be done once at the very first time)
     *
     *  Pull is basically for when you want to pull the latest code from central Repo.(It will take all the latest changes
     *  which your local repo does not have)
     *  So the command is "git pull" .
     *
     */
    //=======================================================================================
    /**
     *  Now you need to cut the branch from the master Branch, because you can not directly work on feature or master
     *  branch, you need to cut your branch anyhow -> Just see in Section 4
     *
     */
    //=======================================================================================
    /**
     * "git log" -> will show all the commit history
     */
}
