package com.tecforte.blog.web.rest.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class BadRequestAlertException extends AbstractThrowableProblem {

    private static final long serialVersionUID = 1L;

    private final String entityName;

    private final String errorKey;
    private final String[] NegativeEmojis = {"angry", "sad"};
    private final String[] PositiveEmojis = {"like", "haha"};
    private final String[] NeutralEmojis = {"wow"};
    private static final String[] NegativeKeywords = {"sad", "fear", "lonely"};
    private static final String[] PositiveKeywords = {"love", "happy", "trust"};
    private static final String message = "Invalid Content";

    public BadRequestAlertException(String defaultMessage, String entityName, String errorKey) {
        this(ErrorConstants.DEFAULT_TYPE, defaultMessage, entityName, errorKey);
    }

    public BadRequestAlertException(URI type, String defaultMessage, String entityName, String errorKey) {
        super(type, defaultMessage, Status.BAD_REQUEST, null, null, null, getAlertParameters(entityName, errorKey));
        this.entityName = entityName;
        this.errorKey = errorKey;
    }

    public String getEntityName() {
        return entityName;
    }

    public String getErrorKey() {
        return errorKey;
    }

    private static Map<String, Object> getAlertParameters(String entityName, String errorKey) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("message", "error." + errorKey);
        parameters.put("params", entityName);
        return parameters;
    }

    
    /*public new BadRequestAlertException2(String [] NegativeEmojis, String [] PositiveEmojis, String[] NeutralEmojis, String message){
    if(blog != negative){
            // Part 1 Question1
            //boolean b1=Boolean.parseBoolean(NegativeEmojis);  
            //b1 = false;
    
            if(NegativeEmojis.isPressed())     
            return String message;
               
    }
    
    else {
            //boolean b2=Boolean.parseBoolean(PositiveEmojis);  
            //b2 = false;
    
         
            if(PositiveEmojis.isPressed())     
            return String message;
    
                               }
    
    }
    }*/

    /*public new BadRequestAlertException(String [] NegativeKeywords, String [] PositiveKeywords, String message)           //Part 1 Question 2
    {
        if(blog != negative){

        Scanner BlogTitle = new Scanner(System.in);
        String input = BlogTitle.nextLine().toLowerCase();
        int dummpynum = 0;

        for (String PositiveKeywords : PositiveKeywords) {
            if (input.contains(PositiveKeywords)) {
                return String message;
            }
        else {
            int dummpynum=1;
            continue;
             }
     
        if(int dummynum =1){

        Scanner BlogContent = new Scanner(System.in);
        String input = BlogContent.nextLine().toLowerCase();

        for (String PositiveKeywords : PositiveKeywords) {
            if (input.contains(PositiveKeywords)) {
                return String message;
            }
        else {
            continue;
             }
                           }
}

else {

Scanner BlogTitle = new Scanner(System.in);
        String input = BlogTitle.nextLine().toLowerCase();
        int dummpynum = 0;

        for (String NegativeKeywords : NegativeKeywords) {
            if (input.contains(NegativeKeywords)) {
                return String message;
            }
        else {
            int dummpynum=1;
            continue;
             }
     
        if(int dummynum =1){

        Scanner BlogContent = new Scanner(System.in);
        String input = BlogContent.nextLine().toLowerCase();

        for (String NegativeKeywords : NegativeKeywords) {
            if (input.contains(NegativeKeywords)) {
                return String message;
            }
        else {
            continue;
             }
                           }

}
    }*/
}
