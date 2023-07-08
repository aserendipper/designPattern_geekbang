package com.part03.day21.code.one;

import org.apache.commons.lang3.StringUtils;

/**
 * @author aserendipper
 * @date 2023/7/7
 * @desc
 */
public class ValidUtil {
    public boolean isValidIp(String ipAddress) {
        if (StringUtils.isBlank(ipAddress)) {
            return false;
        }
        String regex = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$";
        return ipAddress.matches(regex);
    }
    
    public boolean checkIfIpValid(String ipAddress) {
        if (StringUtils.isBlank(ipAddress)) {
            return false;
        }
        String[] ipUnits = ipAddress.split("\\.");
        if (ipUnits.length != 4) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            int ipUnitIntValue;
            try {
                ipUnitIntValue = Integer.parseInt(ipUnits[i]);
            } catch (NumberFormatException e) {
                return false;
            } 
            if (ipUnitIntValue < 0 || ipUnitIntValue > 255) {
                return false;
            }
            if (i == 0 && ipUnitIntValue == 0) {
                return false;
            }
        }
        return true;
    }
}
