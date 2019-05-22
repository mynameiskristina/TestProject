package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p>Profile default : Please change into your own account</p>
     */
    public static Object username
     
    /**
     * <p>Profile default : Please change into your own account</p>
     */
    public static Object password
     
    /**
     * <p>Profile default : Please change into your own account</p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object gistDesc
     
    /**
     * <p></p>
     */
    public static Object gistFilename
     
    /**
     * <p></p>
     */
    public static Object gistContent
     
    /**
     * <p></p>
     */
    public static Object gistContentUpdate
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            username = selectedVariables['username']
            password = selectedVariables['password']
            email = selectedVariables['email']
            gistDesc = selectedVariables['gistDesc']
            gistFilename = selectedVariables['gistFilename']
            gistContent = selectedVariables['gistContent']
            gistContentUpdate = selectedVariables['gistContentUpdate']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
