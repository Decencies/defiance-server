package dev.mappings.defiance.messages

import dev.mappings.defiance.messages.twn.TwnEngineCryptChallengeMsg
import dev.mappings.defiance.messages.twn.TwnEngineCryptResponseMsg
import dev.mappings.defiance.messages.twn.TwnNetDefs

val NetMsgs = mutableMapOf(
    TwnNetDefs.TwnEngineCryptResponse to TwnEngineCryptResponseMsg::class,
    TwnNetDefs.TwnEngineCryptChallenge to TwnEngineCryptChallengeMsg::class
)