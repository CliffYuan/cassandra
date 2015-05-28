/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xnd;

import java.net.InetAddress;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import com.google.common.collect.SetMultimap;

import org.apache.cassandra.dht.Token;

/**
 * Created by xiaoniudu on 15-5-27.
 */
public class StringHelp
{
    public static String arrayList2String(List<InetAddress> list)
    {
        StringBuffer stringBuffer = new StringBuffer();

        for (InetAddress o : list)
        {
            stringBuffer.append(o.getHostAddress()).append(",");
        }

        return stringBuffer.toString();
    }

    public static String arrayList2String(Set<InetAddress> list)
    {
        StringBuffer stringBuffer = new StringBuffer();

        for (InetAddress o : list)
        {
            stringBuffer.append(o.getHostAddress()).append(",");
        }

        return stringBuffer.toString();
    }

    public static String arrayList2String2(Set<Token> list)
    {
        StringBuffer stringBuffer = new StringBuffer();

        for (Token o : list)
        {
            stringBuffer.append(o.getTokenValue()).append(",");
        }

        return stringBuffer.toString();
    }


    public static String SetMultimap(SetMultimap<InetAddress,Token> set){
        StringBuffer stringBuffer = new StringBuffer();

        for (InetAddress o : set.keySet())
        {
            stringBuffer.append(o.getHostAddress()).append("-").append(set.get(o)).append("|");
        }

        return stringBuffer.toString();
    }

    public static String SetMultimap(Map<InetAddress, UUID> set){
        StringBuffer stringBuffer = new StringBuffer();

        for (InetAddress o : set.keySet())
        {
            stringBuffer.append(o.getHostAddress()).append("-").append(set.get(o)).append("|");
        }

        return stringBuffer.toString();
    }

}
