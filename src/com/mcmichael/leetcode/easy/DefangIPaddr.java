package com.mcmichael.leetcode.easy;
class DefangIPaddr {
    public String defangIPaddr(String address) {
        address = address.replaceAll("\\.", "[.]");
        return address;
    }
    public String defangIPaddr2(String address) {
        return address.replace(".", "[.]");
    }
}