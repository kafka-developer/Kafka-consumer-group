package com.xargspratix.consumers;

import java.util.Arrays;

public class Running3Consumers {
    public static void main(String[] args) throws Exception {
        String[] consumerGroups = new String[3];
        Arrays.fill(consumerGroups, "test-consumer-group");
        ConsumerGroupExample.run(3, consumerGroups);
    }
}