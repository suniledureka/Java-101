package co.edureka.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Batch {
	@Id
	@GeneratedValue
	private Integer batchId;
	private String courseTitle;
	
	@ManyToOne
	@JoinColumn(name = "facultyId")
	private Faculty faculty;

	public Batch(String courseTitle, Faculty faculty) {
		super();
		this.courseTitle = courseTitle;
		this.faculty = faculty;
	}

	public Integer getBatchId() {
		return batchId;
	}

	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}
