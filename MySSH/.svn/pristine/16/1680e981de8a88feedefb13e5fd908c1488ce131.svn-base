package cn.com.wanx.application.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="AUTHUSER")
@SequenceGenerator(name="SEQ_AUTHUSER",sequenceName="AUTHUSER_ID_SEQ", allocationSize = 1)
public class Authuser implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer userid;
	private Integer groupid;
	private String groupCode;
	private String orgInnerCode;
	private String userName;
	private String password;
	@Id
	@Column(name="USER_ID",nullable=true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_AUTHUSER")
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	
	@Column(name="GROUP_ID")
	public Integer getGroupid() {
		return groupid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
	@Column(name="GROUP_CODE")
	public String getGroupCode() {
		return groupCode;
	}
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}
	@Column(name="ORG_INNERCODE")
	public String getOrgInnerCode() {
		return orgInnerCode;
	}
	public void setOrgInnerCode(String orgInnerCode) {
		this.orgInnerCode = orgInnerCode;
	}
	@Column(name="USER_NAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
