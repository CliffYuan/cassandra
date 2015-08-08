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

package com.xnd.test;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by xiaoniudu on 15-5-22.
 */
public class MapperByteBufferTest
{

    public static void main(String[] args)throws Exception
    {
        RandomAccessFile raf1 = new RandomAccessFile("/tmp/MapperByteBufferTest.tmp","rw");
        int mapsize = 1024*100;//100K
        FileChannel fc = raf1.getChannel();
        MappedByteBuffer raf = fc.map(FileChannel.MapMode.READ_WRITE, 0, mapsize);
        int i=10;
        while (i>0)
        {
            raf.putInt(i*5);
            i--;
        }
        System.out.printf("all");
        raf.force();
    }
}
