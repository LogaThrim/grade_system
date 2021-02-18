/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade_workshop;

/**
 *
 * @author ADMIN
 */
public class Subject {
    private String term;
    private String sec;
    private String subject_id;
    private String subject_name;
    private String credit;
    private String grade;
    private String subject_group;
    
    public Subject(String Term, String Sec, String Subject_id, String Subject_name, String Credit, String Grade, String Subject_group){
        this.term = Term;
        this.sec = Sec;
        this.subject_id = Subject_id;
        this.subject_name = Subject_name;
        this.credit = Credit;
        this.grade = Grade;
        this.subject_group = Subject_group;
    }
    
    public String getTerm(){
        return term;
    }
    public String getSec(){
        return sec;
    }
    public String getSubjectId(){
        return subject_id;
    }
    public String getSubjectName(){
        return subject_name;
    }
    public String getCredit(){
        return credit;
    }
    public String getGrade(){
        return grade;
    }
    public String getSubjectGroup(){
        return subject_group;
    }
}
