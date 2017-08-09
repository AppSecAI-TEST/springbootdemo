package com.demo.springbootdemo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 成绩
 *
 */
@Entity
@Table(name = "score")
public class Score implements Serializable {
	private static final long serialVersionUID = 8127035730921338189L;

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false, name="STUDENTID") // 这里说一下，我使用指定数据库列的时候，使用小写会不起作用，修改为大写便正常了。不知道为何，如果遇到一样问题的可以尝试下。
    private int stuId;

    @Column(nullable = false, name="SUBJECTNAME")
    private String subjectName;

    @Column(nullable = false)
    private float score;

    @Column(nullable = false, name="EXAMTIME")
    private Date examTime;

	public Score(int id, int stuId, String subjectName, float score, Date examTime) {
		super();
		this.id = id;
		this.stuId = stuId;
		this.subjectName = subjectName;
		this.score = score;
		this.examTime = examTime;
	}

	public Score() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public Date getExamTime() {
		return examTime;
	}

	public void setExamTime(Date examTime) {
		this.examTime = examTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	} 

}
