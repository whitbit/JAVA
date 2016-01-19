package model.base.api.game.details;

import java.text.DecimalFormat;

public class Achievement {
	private int defaultvalue, hidden;
	private String description, displayName, icon, icongray, name;
	private double percent;

	public Achievement() {}

	public int getDefaultvalue() {
		return defaultvalue;
	}
	public void setDefaultvalue( Integer defaultvalue ) {
		this.defaultvalue = defaultvalue.intValue();
	}
	public int getHidden() {
		return hidden;
	}
	public void setHidden( Integer hidden ) {
		this.hidden = hidden.intValue();
	}
	public String getDescription() {
		return description;
	}
	public void setDescription( String description ) {
		this.description = description;
	}
	public String getDisplayName() {
		return displayName;
	}
	public void setDisplayName( String displayName ) {
		this.displayName = displayName;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon( String icon ) {
		this.icon = icon;
	}
	public String getIcongray() {
		return icongray;
	}
	public void setIcongray( String icongray ) {
		this.icongray = icongray;
	}
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public double getPercent() {
		return Double.parseDouble( new DecimalFormat( "###.###" ).format( percent ).toString().replace( ',', '.' ) );
	}
	public void setPercent( Double percent ) {
		this.percent = percent.doubleValue();
	}
}