//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.06.21 at 12:16:12 AM BST 
//


package pl.baczkowicz.spy.common.generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecureSocketModeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecureSocketModeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DISABLED"/&gt;
 *     &lt;enumeration value="BASIC"/&gt;
 *     &lt;enumeration value="SERVER_ONLY"/&gt;
 *     &lt;enumeration value="SERVER_AND_CLIENT"/&gt;
 *     &lt;enumeration value="SERVER_KEYSTORE"/&gt;
 *     &lt;enumeration value="SERVER_AND_CLIENT_KEYSTORES"/&gt;
 *     &lt;enumeration value="PROPERTIES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SecureSocketModeEnum")
@XmlEnum
public enum SecureSocketModeEnum {

    DISABLED,
    BASIC,
    SERVER_ONLY,
    SERVER_AND_CLIENT,
    SERVER_KEYSTORE,
    SERVER_AND_CLIENT_KEYSTORES,
    PROPERTIES;

    public String value() {
        return name();
    }

    public static SecureSocketModeEnum fromValue(String v) {
        return valueOf(v);
    }

}
