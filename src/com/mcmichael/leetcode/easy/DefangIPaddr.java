package com.mcmichael.leetcode.easy;
class DefangIPaddr {
    public String defangIPaddr(String address) {
        address = address.replaceAll("\\.", "[.]");
        return address;
    }
}