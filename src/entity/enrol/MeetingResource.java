
package entity.enrol;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The type Meeting resource.
 */
public class MeetingResource {

    @SerializedName("sessionCode")
    @Expose
    private String sessionCode;
    @SerializedName("activityCode")
    @Expose
    private String activityCode;
    @SerializedName("sectionCode")
    @Expose
    private String sectionCode;
    @SerializedName("teachMethod")
    @Expose
    private String teachMethod;
    @SerializedName("sectionNumber")
    @Expose
    private String sectionNumber;
    @SerializedName("sequence")
    @Expose
    private Integer sequence;
    @SerializedName("instructorOrgUnit")
    @Expose
    private Object instructorOrgUnit;
    @SerializedName("teachPercent")
    @Expose
    private Object teachPercent;
    @SerializedName("employeeNumber")
    @Expose
    private Object employeeNumber;
    @SerializedName("logCounter")
    @Expose
    private Integer logCounter;
    @SerializedName("employeeType")
    @Expose
    private Object employeeType;
    @SerializedName("instructorSurname")
    @Expose
    private String instructorSurname;
    @SerializedName("instructorFirstName")
    @Expose
    private String instructorFirstName;
    @SerializedName("instructorInitials")
    @Expose
    private String instructorInitials;

    /**
     * Gets session code.
     *
     * @return The      sessionCode
     */
    public String getSessionCode() {
        return sessionCode;
    }

    /**
     * Sets session code.
     *
     * @param sessionCode The sessionCode
     */
    public void setSessionCode(String sessionCode) {
        this.sessionCode = sessionCode;
    }

    /**
     * Gets activity code.
     *
     * @return The      activityCode
     */
    public String getActivityCode() {
        return activityCode;
    }

    /**
     * Sets activity code.
     *
     * @param activityCode The activityCode
     */
    public void setActivityCode(String activityCode) {
        this.activityCode = activityCode;
    }

    /**
     * Gets section code.
     *
     * @return The      sectionCode
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * Sets section code.
     *
     * @param sectionCode The sectionCode
     */
    public void setSectionCode(String sectionCode) {
        this.sectionCode = sectionCode;
    }

    /**
     * Gets teach method.
     *
     * @return The      teachMethod
     */
    public String getTeachMethod() {
        return teachMethod;
    }

    /**
     * Sets teach method.
     *
     * @param teachMethod The teachMethod
     */
    public void setTeachMethod(String teachMethod) {
        this.teachMethod = teachMethod;
    }

    /**
     * Gets section number.
     *
     * @return The      sectionNumber
     */
    public String getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Sets section number.
     *
     * @param sectionNumber The sectionNumber
     */
    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    /**
     * Gets sequence.
     *
     * @return The      sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets sequence.
     *
     * @param sequence The sequence
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * Gets instructor org unit.
     *
     * @return The      instructorOrgUnit
     */
    public Object getInstructorOrgUnit() {
        return instructorOrgUnit;
    }

    /**
     * Sets instructor org unit.
     *
     * @param instructorOrgUnit The instructorOrgUnit
     */
    public void setInstructorOrgUnit(Object instructorOrgUnit) {
        this.instructorOrgUnit = instructorOrgUnit;
    }

    /**
     * Gets teach percent.
     *
     * @return The      teachPercent
     */
    public Object getTeachPercent() {
        return teachPercent;
    }

    /**
     * Sets teach percent.
     *
     * @param teachPercent The teachPercent
     */
    public void setTeachPercent(Object teachPercent) {
        this.teachPercent = teachPercent;
    }

    /**
     * Gets employee number.
     *
     * @return The      employeeNumber
     */
    public Object getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * Sets employee number.
     *
     * @param employeeNumber The employeeNumber
     */
    public void setEmployeeNumber(Object employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    /**
     * Gets log counter.
     *
     * @return The      logCounter
     */
    public Integer getLogCounter() {
        return logCounter;
    }

    /**
     * Sets log counter.
     *
     * @param logCounter The logCounter
     */
    public void setLogCounter(Integer logCounter) {
        this.logCounter = logCounter;
    }

    /**
     * Gets employee type.
     *
     * @return The      employeeType
     */
    public Object getEmployeeType() {
        return employeeType;
    }

    /**
     * Sets employee type.
     *
     * @param employeeType The employeeType
     */
    public void setEmployeeType(Object employeeType) {
        this.employeeType = employeeType;
    }

    /**
     * Gets instructor surname.
     *
     * @return The      instructorSurname
     */
    public String getInstructorSurname() {
        return instructorSurname;
    }

    /**
     * Sets instructor surname.
     *
     * @param instructorSurname The instructorSurname
     */
    public void setInstructorSurname(String instructorSurname) {
        this.instructorSurname = instructorSurname;
    }

    /**
     * Gets instructor first name.
     *
     * @return The      instructorFirstName
     */
    public String getInstructorFirstName() {
        return instructorFirstName;
    }

    /**
     * Sets instructor first name.
     *
     * @param instructorFirstName The instructorFirstName
     */
    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    }

    /**
     * Gets instructor initials.
     *
     * @return The      instructorInitials
     */
    public String getInstructorInitials() {
        return instructorInitials;
    }

    /**
     * Sets instructor initials.
     *
     * @param instructorInitials The instructorInitials
     */
    public void setInstructorInitials(String instructorInitials) {
        this.instructorInitials = instructorInitials;
    }

}
