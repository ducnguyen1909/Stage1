package com.tma.project.entities;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("time")
public class Time {

	@PrimaryKey("time_id")
	private UUID timeId;
	@Column("month")
	private Integer month;
	@Column("quarter")
	private Integer quarter;
	@Column("year")
	private Integer year;

	public Time(UUID timeId, Integer month, Integer quarter, Integer year) {
		this.timeId = timeId;
		this.month = month;
		this.quarter = quarter;
		this.year = year;
	}

	public UUID getTimeId() {
		return timeId;
	}

	public void setTimeId(UUID timeId) {
		this.timeId = timeId;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getQuarter() {
		return quarter;
	}

	public void setQuarter(Integer quarter) {
		this.quarter = quarter;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

}
