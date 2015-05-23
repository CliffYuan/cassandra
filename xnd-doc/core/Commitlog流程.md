### commitlog流程


目前的commitlog策略：
1.定时执行刷盘
2.或者切换commitlogsegment执行刷盘

是否会丢失log??
经过测试，是同步写commitlog

MappedByteBuffer.write();//直接入磁盘了
MappedByteBuffer.force()//没有进行任何操作，连file修改时间都没有变