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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classIdOrClassShortNameOrClazz"
})
@XmlRootElement(name = "NotQualifiedSubstituteClass")
public class NotQualifiedSubstituteClass {

    @XmlElements({
        @XmlElement(name = "ClassId", required = true, type = ClassId.class),
        @XmlElement(name = "ClassShortName", required = true, type = ClassShortName.class),
        @XmlElement(name = "Class", required = true, type = Class.class)
    })
    protected List<Object> classIdOrClassShortNameOrClazz;

    /**
     * Gets the value of the classIdOrClassShortNameOrClazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classIdOrClassShortNameOrClazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassIdOrClassShortNameOrClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassId }
     * {@link ClassShortName }
     * {@link Class }
     * 
     * 
     */
    public List<Object> getClassIdOrClassShortNameOrClazz() {
        if (classIdOrClassShortNameOrClazz == null) {
            classIdOrClassShortNameOrClazz = new ArrayList<Object>();
        }
        return this.classIdOrClassShortNameOrClazz;
    }

}
