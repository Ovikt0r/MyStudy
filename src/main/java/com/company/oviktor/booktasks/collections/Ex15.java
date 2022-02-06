package com.company.oviktor.booktasks.collections;

import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class Ex15 {

    public static void main(String[] args) {
        String s = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        Stack<Character> characterStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+') {
                characterStack.push(s.charAt(++i));
            }
            if (s.charAt(i) == '-') {
                log.info(String.valueOf(characterStack.pop()));
            }
        }

    }
}
