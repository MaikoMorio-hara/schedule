package jp.ac.ohara.schedule.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
// @Dataと@Entityがあるときはゲッター、セッターは書かなくていい
@Table(name="schedules")
public class ScheduleBook{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	//名前
	@Column(length = 50, nullable = false)
	private String name;
	
	//日付
	@Column(length = 25, nullable = false)
	private String day;
	
	
	//タイトル
	@Column(length = 50, nullable = false)
	private String title;
	
		
	//詳細
	@Column(length = 50, nullable = false)
	private String detail;
}