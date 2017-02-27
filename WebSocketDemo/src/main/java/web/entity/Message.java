package web.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 */
@Entity
@Table(name = "tb_wsMessage")
public class Message {

	//发送者
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "from_msg")
	public Long from;
	//发送者名称
	@Column(name = "fromName_msg")
	public String fromName;
	
	//接收者
	@Column(name = "to_msg")
	public Long to;
	
	//发送的文本
	@Column(name = "text_msg")
	public String text;
	
	//发送日期
	@Column(name = "date_msg")
	public Date date;

	public Long getFrom() {
		return from;
	}

	public void setFrom(Long from) {
		this.from = from;
	}

	public Long getTo() {
		return to;
	}

	public void setTo(Long to) {
		this.to = to;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFromName() {
		return fromName;
	}

	public void setFromName(String fromName) {
		this.fromName = fromName;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
