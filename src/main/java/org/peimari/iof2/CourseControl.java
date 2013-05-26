//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.25 at 02:13:44 PM EEST 
//

package org.peimari.iof2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "sequence", "controlCodeOrControl",
		"comment", "legLength", "mapTextPosition" })
@XmlRootElement(name = "CourseControl")
public class CourseControl {

	@XmlAttribute(name = "markedRoute")
	@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
	protected String markedRoute;
	@XmlElement(name = "Sequence", required = true)
	protected String sequence;
	@XmlElements({
			@XmlElement(name = "ControlCode", required = true, type = ControlCode.class),
			@XmlElement(name = "Control", required = true, type = Control.class) })
	protected List<Object> controlCodeOrControl;
	@XmlElement(name = "Comment")
	protected List<Comment> comment;
	@XmlElement(name = "LegLength")
	protected List<LegLength> legLength;
	@XmlElement(name = "MapTextPosition")
	protected MapTextPosition mapTextPosition;

	/**
	 * Gets the value of the markedRoute property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMarkedRoute() {
		if (markedRoute == null) {
			return "N";
		} else {
			return markedRoute;
		}
	}

	/**
	 * Sets the value of the markedRoute property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMarkedRoute(String value) {
		this.markedRoute = value;
	}

	/**
	 * Gets the value of the sequence property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * Sets the value of the sequence property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSequence(String value) {
		this.sequence = value;
	}

	/**
	 * Gets the value of the controlCodeOrControl property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the controlCodeOrControl property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getControlCodeOrControl().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ControlCode } {@link Control }
	 * 
	 * 
	 */
	public List<Object> getControlCodeOrControl() {
		if (controlCodeOrControl == null) {
			controlCodeOrControl = new ArrayList<Object>();
		}
		return this.controlCodeOrControl;
	}

	/**
	 * Gets the value of the comment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the comment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getComment().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Comment }
	 * 
	 * 
	 */
	public List<Comment> getComment() {
		if (comment == null) {
			comment = new ArrayList<Comment>();
		}
		return this.comment;
	}

	/**
	 * Gets the value of the legLength property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the legLength property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getLegLength().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link LegLength }
	 * 
	 * 
	 */
	public List<LegLength> getLegLength() {
		if (legLength == null) {
			legLength = new ArrayList<LegLength>();
		}
		return this.legLength;
	}

	/**
	 * Gets the value of the mapTextPosition property.
	 * 
	 * @return possible object is {@link MapTextPosition }
	 * 
	 */
	public MapTextPosition getMapTextPosition() {
		return mapTextPosition;
	}

	/**
	 * Sets the value of the mapTextPosition property.
	 * 
	 * @param value
	 *            allowed object is {@link MapTextPosition }
	 * 
	 */
	public void setMapTextPosition(MapTextPosition value) {
		this.mapTextPosition = value;
	}

	@Override
	public String toString() {
		try {
			return getControlCodeOrControl().get(0).toString();
		} catch (Exception e) {
			return super.toString();
		}
	};

}