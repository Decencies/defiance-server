package dev.mappings.defiance.messages.twn

// Taken from Build 336811 (Xbox-360 30/11/2012)
object TwnNetDefs {
    const val TwnEngineUdpConnect = 0
    const val TwnEngineUdpConnected = 1
    const val TwnEngineBBSessionDEPRECATED = 2
    const val TwnEngineBBSessionResponseDEPRECATED = 3
    const val TwnEngineBBEventDEPRECATED = 4
    const val TwnEngineBBCrashDEPRECATED = 5
    const val TwnEngineBBFinishedDEPRECATED = 6
    const val TwnEngineCryptChallenge = 7
    const val TwnEngineCryptResponse = 8
    const val TwnEngineBBCrashV2DEPRECATED = 9
    const val TwnEngineLogLine = 10
    const val TwnEngineCrashInfo = 11

    const val NumReservedEngineMsgTypes = 64
}