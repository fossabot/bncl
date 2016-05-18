![alt text](logo.png)

natural like creation language for bpmn-process-models, based on java and bpmn 2.0 xml
*by Niklas Kiefer*

find runnable in subfolder **executables**

> java -jar bncl-[versionNr.].jar

**example bcnl-statement:**

> lets create a process with startevent signed startEvent1 called startevent1 with usertask signed usertask1 called dosomething with usertask signed usertask2 with parallelgateway signed gateway1 with parallelgateway signed gateway2 with sequenceflow comesfrom startevent1 goesto gateway1 with sequenceflow comesfrom gateway1 goesto usertask1 with sequenceflow comesfrom gateway1 goesto usertask2 with sequenceflow comesfrom usertask1 goesto gateway2 with sequenceflow comesfrom usertask2 goesto gateway2 with endevent signed endevent1 called terminated with sequenceflow comesfrom gateway2 goesto endevent1

if success: .xml and .bpmn file is generated in same folder

----------

BNCL-structure (12.05.2016) - STILL UNDER DEVELOPMENT
-----------------------------------------------------

everything in bncl is case insensitive, but it is always a good idea to write it in small letters.

    lets create a process

  is a keyword group that signs the beginning of a bncl-statement

	with

is a keyword that signs the beginning of a process element

    sequenceworkflow

signs a sequence workflow between process elements. **comesfrom** with given id signs the fromElement, **goesto** signes the toElement.

**normal events:**
 - startevent
 - endevent
 - catchevent (Intermediate)
 - throevent (Intermediate)

**special events:**
 - messagestartevent
 - messageendevent
 - messagethrowevent
 - messagecatchevent

**tasks:**
 - usertask
 - sendtask (Message)
 - receivetask (Message)
 - scripttask
 - manualtask
 - businessruletask
 - servicetask

**gateways:**
 - parallelgateway

**attributes:**
 - called = name
 - signed (required) = id
