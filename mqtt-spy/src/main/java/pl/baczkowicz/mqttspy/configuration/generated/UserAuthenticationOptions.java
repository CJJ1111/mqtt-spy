//
// Copyright (c) 2015 Kamil Baczkowicz
//
// CSOFF: a.*
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Timestamp removed by maven-replacer-plugin to avoid detecting changes - see the project POM for details
//


package pl.baczkowicz.mqttspy.configuration.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for UserAuthenticationOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserAuthenticationOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AskForUsername" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="AskForPassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
*/
@SuppressWarnings("all")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAuthenticationOptions", propOrder = {
    "askForUsername",
    "askForPassword"
})
public class UserAuthenticationOptions implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "AskForUsername")
    protected boolean askForUsername;
    @XmlElement(name = "AskForPassword")
    protected boolean askForPassword;

    /**
     * Default no-arg constructor
     * 
     */
    public UserAuthenticationOptions() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public UserAuthenticationOptions(final boolean askForUsername, final boolean askForPassword) {
        this.askForUsername = askForUsername;
        this.askForPassword = askForPassword;
    }

    /**
     * Gets the value of the askForUsername property.
     * 
     */
    public boolean isAskForUsername() {
        return askForUsername;
    }

    /**
     * Sets the value of the askForUsername property.
     * 
     */
    public void setAskForUsername(boolean value) {
        this.askForUsername = value;
    }

    /**
     * Gets the value of the askForPassword property.
     * 
     */
    public boolean isAskForPassword() {
        return askForPassword;
    }

    /**
     * Sets the value of the askForPassword property.
     * 
     */
    public void setAskForPassword(boolean value) {
        this.askForPassword = value;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            boolean theAskForUsername;
            theAskForUsername = this.isAskForUsername();
            toStringBuilder.append("askForUsername", theAskForUsername);
        }
        {
            boolean theAskForPassword;
            theAskForPassword = this.isAskForPassword();
            toStringBuilder.append("askForPassword", theAskForPassword);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof UserAuthenticationOptions)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final UserAuthenticationOptions that = ((UserAuthenticationOptions) object);
        equalsBuilder.append(this.isAskForUsername(), that.isAskForUsername());
        equalsBuilder.append(this.isAskForPassword(), that.isAskForPassword());
    }

    public boolean equals(Object object) {
        if (!(object instanceof UserAuthenticationOptions)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.isAskForUsername());
        hashCodeBuilder.append(this.isAskForPassword());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final UserAuthenticationOptions copy = ((target == null)?((UserAuthenticationOptions) createCopy()):((UserAuthenticationOptions) target));
        {
            boolean sourceAskForUsername;
            sourceAskForUsername = this.isAskForUsername();
            boolean copyAskForUsername = ((boolean) copyBuilder.copy(sourceAskForUsername));
            copy.setAskForUsername(copyAskForUsername);
        }
        {
            boolean sourceAskForPassword;
            sourceAskForPassword = this.isAskForPassword();
            boolean copyAskForPassword = ((boolean) copyBuilder.copy(sourceAskForPassword));
            copy.setAskForPassword(copyAskForPassword);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new UserAuthenticationOptions();
    }

}
