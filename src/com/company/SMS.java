package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by el693 (who is super cool and awesome) on 2/8/18.
 */
public class SMS  {
    private ArrayList<String> messageInfo = new ArrayList<>();
    private File file = new File("messages.txt");
    public SMS() {

    }
    public String getLatestMessage(){
        

    }

    public void sendMessage(String message, String time){
        messages.add(message);
        timeCodes.add(time);
    }

}
