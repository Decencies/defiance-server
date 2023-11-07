package dev.mappings.defiance.messages

// Channel 2 Game Client Build 336811
object MessageType {
    // Ch2NetMsgFactory
    const val Ch2PositionUpdate = 512
    const val Ch2CreateProxy = 513
    const val Ch2DestroyProxy = 514
    const val Ch2ProxyOwnership = 515
    const val Ch2InitializePlayerData = 516
    const val Ch2UpdateCharacterWeaponData = 517
    const val Ch2UpdatePlayerAbilityData = 518
    const val Ch2UpdateCharacterGrenadeData = 519
    const val Ch2UpdatePlayerWeaponData = 520
    const val Ch2InitializePlayerWeaponData = 521
    const val Ch2BindPlayerRequest = 522
    const val Ch2BindPlayerResponse = 523
    const val Ch2InstanceLeave = 524
    const val Ch2StartLocRequest = 525
    const val Ch2StartLocResponse = 526
    const val Ch2PlayerProxyRequest = 527
    const val Ch2JoinWorldRequest = 528
    const val Ch2JoinWorldResponse = 529
    const val Ch2PolylinePath = 530
    const val Ch2SetWaypoint = 531
    const val Ch2WaypointLocations = 532
    const val Ch2ClientCharacterPropertyUpdate = 533
    const val Ch2ClientCharacterPropertyDeltaUpdate = 534
    const val Ch2CharacterEntityPropertyMapUpdate = 535
    const val Ch2ClientCharacterPropertyArrayUpdate = 536
    const val Ch2ClientVehicleStatUpdate = 537
    const val Ch2CreateClientCharacterProxy = 538
    const val Ch2CreateTeleportProxy = 539
    const val Ch2CreateGroupTeleportProxy = 540
    const val Ch2CreateTreasureChestProxy = 541
    const val Ch2UpdateTreasureChestProxy = 542
    const val Ch2CreateExtractionPointProxy = 543
    const val Ch2CreateCheckPointProxy = 544
    const val Ch2CreateDoorProxy = 545
    const val Ch2UpdateDoorProxy = 546
    const val Ch2EnableHitLocation = 547
    const val Ch2UpdateHitLocations = 548
    const val Ch2CreateHarvestProxy = 549
    const val Ch2CreateAoEProxy = 550
    const val Ch2CreateClientDebugProxy = 551
    const val Ch2PlayerStatUpdate = 552
    const val Ch2BgStatUpdate = 553
    const val Ch2ShadowWarStatUpdate = 554
    const val Ch2ShadowWarScores = 555
    const val Ch2GroupInstanceStats = 556
    const val Ch2SmartProjectileApproach = 557
    const val Ch2SmartProjectileSetTarget = 558
    const val Ch2UseAbility = 559
    const val Ch2StartWeaponFiring = 560
    const val Ch2EndWeaponFiring = 561
    const val Ch2ResolveAbility = 562
    const val Ch2FinishAbility = 563
    const val Ch2AbortAbility = 564
    const val Ch2CancelAction = 565
    const val Ch2FinishReload = 566
    const val Ch2UpdateClip = 567
    const val Ch2EnableCamera = 568
    const val Ch2CharacterStateRequest = 569
    const val Ch2CharacterAppearanceRequest = 570
    const val Ch2CharacterAssumeControl = 571
    const val Ch2ToggleInvulnerability = 572
    const val Ch2CreateProjectileProxy = 573
    const val Ch2AttachProjectile = 574
    const val Ch2ProjectileMergeTrajectory = 575
    const val Ch2ProjectileFinalize = 576
    const val Ch2ClientProjectileFinalize = 577
    const val Ch2ClientServerCommand = 578
    const val Ch2ClientServerCommandResponse = 579
    const val Ch2ServerSendNonLocalizedOutput = 580
    const val Ch2ServerSendLocalizedOutput = 581
    const val Ch2PlaySound = 582
    const val Ch2Exploration = 583
    const val Ch2RemoteServerCommand = 584
    const val Ch2SendServerCommands = 585
    const val Ch2CommandPopup = 586
    const val Ch2SalvageAction = 588
    const val Ch2SalvageAppraisal = 589
    const val Ch2SalvageHackBarterResponse = 590
    const val Ch2CreateDestructibleProxy = 591
    const val Ch2DestructibleFinalize = 592
    const val Ch2LeaveWorld = 593
    const val Ch2InventoryAction = 596
    const val Ch2InventoryDisplay = 597
    const val Ch2InventoryModAppearanceUpdate = 598
    const val Ch2UpdateArmorTints = 599
    const val Ch2OutfitRequest = 600
    const val Ch2OutfitAppearances = 601
    const val Ch2MerchantDisplay = 602
    const val Ch2MerchantOperation = 603
    const val Ch2RecombinatorAction = 604
    const val Ch2RecombinatorView = 605
    const val Ch2RecombinatorEnd = 606
    const val Ch2MissionOfferedInfo = 609
    const val Ch2RaidUpdate = 610
    const val Ch2RaidCreate = 611
    const val Ch2RaidDisband = 613
    const val Ch2RaidMove = 614
    const val Ch2UpdateGuildName = 615
    const val Ch2PlayerGuildData = 616
    const val Ch2PlayerGuildCreateData = 617
    const val Ch2GuildMemberData = 618
    const val Ch2GuildBankOperation = 619
    const val Ch2GuildMemberDataRequest = 620
    const val Ch2GuildLogoData = 621
    const val Ch2GuildTextBroadcast = 622
    const val Ch2GuildUpdate = 623
    const val Ch2MissionHelperUpdate = 624
    const val Ch2MissionHelperUpdateObjective = 625
    const val Ch2LoadStateUpdate = 626
    const val Ch2QueryInteract = 627
    const val Ch2Interact = 628
    const val Ch2InteractResult = 629
    const val Ch2AssignActivateQuest = 630
    const val Ch2JoinQuestFailed = 631
    const val Ch2MissionFailed = 632
    const val Ch2QueryMissionLogInfo = 633
    const val Ch2MissionLogInfo = 634
    const val Ch2AbandonQuest = 635
    const val Ch2IntelRequest = 636
    const val Ch2IntelCategories = 637
    const val Ch2IntelItemsInCat = 638
    const val Ch2IntelItemsInSubCat = 639
    const val Ch2IntelItem = 640
    const val Ch2IntelSeenItems = 641
    const val Ch2PlayerActivityTracking = 642
    const val Ch2SkillRequest = 643
    const val Ch2SkillListing = 644
    const val Ch2UpdateActorStates = 645
    const val Ch2EgoCall = 646
    const val Ch2UpdateProxy = 647
    const val Ch2PlayEffect = 648
    const val Ch2GroupSwapCharacter = 649
    const val Ch2Knockback = 650
    const val Ch2GetTrackedMissions = 651
    const val Ch2RequestPath = 652
    const val Ch2DisplayCombatText = 653
    const val Ch2SwitchWeapon = 655
    const val Ch2GetAchievementInfo = 656
    const val Ch2AchievementCategoryInfo = 657
    const val Ch2AchievementInfo = 658
    const val Ch2SpecificAchievementInfo = 659
    const val Ch2CreateSpawnActorProxy = 660
    const val Ch2PlayerSaveRole = 661
    const val Ch2PlayerActivateEgoPoint = 662
    const val Ch2PlayerUpdateWeaponLoadOut = 663
    const val Ch2PlayerUpdateRoleItem = 664
    const val Ch2PlayerUpdateRoleName = 665
    const val Ch2PlayerUpdateAbility = 666
    const val Ch2PlayerRequestRoleData = 667
    const val Ch2PlayerSwitchRole = 668
    const val Ch2PlayerRoleSummaries = 669
    const val Ch2GetPlayerEgoPointInfo = 670
    const val Ch2PlayerEgoPointInfo = 671
    const val Ch2PlayerPurchaseEgoPoint = 672
    const val Ch2PlayerRespecEgoPoint = 673 // not a typo (from our side)
    const val Ch2PlayerEgoPointSummary = 674
    const val Ch2PlayerCurrentRoleData = 675
    const val Ch2GetPlayerAbilityInfo = 676
    const val Ch2PlayerAbilityInfo = 677
    const val Ch2PlayerAbilitySummary = 678
    const val Ch2PlayerWeaponSkillInfo = 679
    const val Ch2PlayerWeaponSkillSummary = 680
    const val Ch2PersistedMissionReset = 681
    const val Ch2InitializeWeapon = 682
    const val Ch2ClearReuseTimers = 683
    const val Ch2AdjustTimers = 684
    const val Ch2CharacterDeathClient = 685
    const val Ch2CameraData = 686
    const val Ch2ProxyDebugText = 687
    const val Ch2CharacterDataDump = 688
    const val Ch2TradeStartChallenge = 689
    const val Ch2TradeStartResponse = 690
    const val Ch2TradeStart = 691
    const val Ch2TradeAddItem = 692
    const val Ch2TradeItemAdded = 693
    const val Ch2TradeRemItem = 694
    const val Ch2TradeItemRemoved = 695
    const val Ch2TradeFinalize = 696
    const val Ch2TradeEnd = 697
    const val Ch2OpenTreasureChest = 698
    const val Ch2LootTreasureChest = 699
    const val Ch2TreasureChestItemLooted = 700
    const val Ch2HitVFX = 701
    const val Ch2GetMapInfo = 702
    const val Ch2MapInfo = 703
    const val Ch2GetSpecificZoneMapInfo = 704
    const val Ch2SpecificZoneMapInfo = 705
    const val Ch2UseMelee = 706
    const val Ch2BmgAddTarget = 708
    const val Ch2BmgSetPrimary = 709
    const val Ch2BmgClear = 710
    const val Ch2BmgActivate = 711
    const val Ch2EffectVisualization = 712
    const val Ch2ClientLocalVFX = 713
    const val Ch2InteractTimer = 714
    const val Ch2ExtractPlayer = 715
    const val Ch2ApplyFallingDamage = 716
    const val Ch2NextAttackBonus = 717
    const val Ch2InteractCancel = 718
    const val Ch2AssassinQueue = 719
    const val Ch2AssassinUpdate = 720
    const val Ch2AssassinStatUpdate = 721
    const val Ch2SetPvPTarget = 722
    const val Ch2PvPKill = 723
    const val Ch2ShareGroupQuest = 724
    const val Ch2AssassinPlayerKilled = 725
    const val Ch2HitReaction = 726
    const val Ch2PullAbility = 727
    const val Ch2PullTarget = 728
    const val Ch2CookGrenade = 729
    const val Ch2PlayThrowAnimation = 730
    const val Ch2TossGrenade = 731
    const val Ch2TeleportAbility = 732
    const val Ch2ResolveShot = 733
    const val Ch2ResolveMultiShot = 734
    const val Ch2ShotFixup = 735
    const val Ch2CreateAttractorClientProxy = 737
    const val Ch2AttractorActivated = 738
    const val Ch2EncounterResources = 739
    const val Ch2ForceClientQuit = 740
    const val Ch2RunCutscene = 741
    const val Ch2GetCharacterAppearanceData = 742
    const val Ch2CharacterAppearanceData = 743
    const val Ch2VehicleChassisCollide = 744
    const val Ch2PlayerFeedback = 745
    const val Ch2InvalidateVehicleData = 746
    const val Ch2AttachOperator = 747
    const val Ch2VehicleEvent = 748
    const val Ch2SetWeaponLoadOutPosition = 749
    const val Ch2RemoveNeedlesFrom = 750
    const val Ch2RequestProxyStats = 751
    const val Ch2ProxyStatsData = 752
    const val Ch2QueryInteractVehicle = 753
    const val Ch2BattleGroundData = 754
    const val Ch2RefuseQuest = 755
    const val Ch2ArkfallLocations = 756
    const val Ch2InstanceInfo = 757
    const val Ch2RespawnPointSelection = 758
    const val Ch2VehicleCreateResult = 759
    const val Ch2ClientOverridePos = 760
    const val Ch2ClientVehicleCollide = 761
    const val Ch2QuickTravel = 762
    const val Ch2GetMaxAmmoCounts = 763
    const val Ch2MaxAmmoCounts = 764
    const val Ch2ActionJump = 765
    const val Ch2ActionReload = 766
    const val Ch2ActionEmote = 767
    const val Ch2ActionAggro = 768
    const val Ch2ActionPlayState = 769
    const val Ch2ActionLocomotion = 770
    const val Ch2ActionHitReactInterrupt = 771
    const val Ch2ActionOverheat = 772
    const val Ch2SelfReviveActivate = 773
    const val Ch2SelfReviveDeactivate = 774
    const val Ch2ActionStopState = 775
    const val Ch2VehicleCreate = 776
    const val Ch2MissionComplete = 777
    const val Ch2LadderStateChange = 778
    const val Ch2RespawnPointUpdate = 779
    const val Ch2InteractOverrideAnimState = 780
    const val Ch2RewardsResult = 781
    const val Ch2CloakShimmer = 782
    const val Ch2DespawnEntity = 783
    const val Ch2DebugDrawSphere = 784
    const val Ch2DebugDrawLine = 785
    const val Ch2DebugDrawArrow = 786
    const val Ch2DebugDrawBox = 787
    const val Ch2ResetUi = 788
    const val Ch2LadderSurfaceChange = 789
    const val Ch2BgEndStats = 790
    const val Ch2ResolvePlayerAbility = 791
    const val Ch2CheckpointPlayState = 792
    const val Ch2CheckpointUpdate = 793
    const val Ch2RunCinematic = 794
    const val Ch2HologramOriginator = 795
    const val Ch2HologramSwitcheroo = 796
    const val Ch2PlayerSwitcherooTeleport = 797
    const val Ch2LevelUp = 798
    const val Ch2PlayVOM = 799
    const val Ch2UseGroundPound = 800
    const val Ch2CancelCinematic = 801
    const val Ch2DecrementClip = 802
    const val Ch2EncounterEventData = 803
    const val Ch2DynamicEventData = 804
    const val Ch2EncounterData = 805
    const val Ch2DynamicTheme = 806
    const val Ch2VehicleLoadNotify = 807
    const val Ch2VehicleRefreshBoost = 808
    const val Ch2RequestActivatePlayerAbility = 809
    const val Ch2RequestDeactivatePlayerAbility = 810
    const val Ch2PlayerAbilityStarted = 811
    const val Ch2PlayerAbilityEnded = 812
    const val Ch2PlayerAbilityReady = 813
    const val Ch2ScoreMultiplierDecreased = 814
    const val Ch2PreloadCinematic = 815
    const val Ch2CancelPreloadCinematic = 816
    const val Ch2PlayerBleedOut = 817
    const val Ch2CinematicSkipRequest = 818
    const val Ch2ReputationUpdate = 819
    const val Ch2DebugRacePath = 820
    const val Ch2CombatMusicPlay = 821
    const val Ch2CombatMusicStop = 822
    const val Ch2DebugVehicleSummonInvalidPosition = 823
    const val Ch2GetReputationInfo = 824
    const val Ch2ReputationGroupInfo = 825
    const val Ch2ReputationGroupTaskInfo = 826
    const val Ch2ShadowWarPlayerAboutToEnter = 827
    const val Ch2ShadowWarPlayerEnteredMatch = 828
    const val Ch2CaptureNHoldObjRefresh = 829
    const val Ch2HideHelmet = 830
    const val Ch2RequestProxyFilterDetails = 831
    const val Ch2ProxyFilterDetails = 832
    const val Ch2PlayerVehicleSkillUpdate = 833
    const val Ch2PlayerVehicleXP = 834
    const val Ch2PlayerUpdateBattleGroupAvePower = 835
    const val Ch2RequestCinematic = 836
    const val Ch2MtxRequestInfo = 837
    const val Ch2MtxWallet = 838
    const val Ch2MtxInfo = 839
    const val Ch2MtxPurchase = 840
    const val Ch2MtxRedeemCode = 841
    const val Ch2MtxClaimItem = 842
    const val Ch2MtxResponse = 843

    // Ch2CoreMsgFactory
    const val Ch2AuthRequest = 0x40
    const val Ch2AuthResponse = 0x41
    const val Ch2GatewayAuth = 0x42
    const val Ch2TimeStamp = 0x43
    const val Ch2ShardListRequest = 0x44
    const val Ch2ShardListResponse = 0x45
    const val Ch2ShardJoinRequest = 0x46
    const val Ch2ShardJoinResponse = 0x47
    const val Ch2CharacterCreationDataRequest = 0x48
    const val Ch2CharacterCreationData = 0x49
    const val Ch2CharacterCreate = 0x4A
    const val Ch2CharacterCreateResponse = 0x4B
    const val Ch2CharacterListRequest = 0x4C
    const val Ch2CharacterListResponse = 0x4D
    const val Ch2CharacterSelect = 0x4E
    const val Ch2CharacterSelectResponse = 0x4F
    const val Ch2CharacterDelete = 0x50
    const val Ch2CharacterLogout = 0x51
    const val Ch2CharacterDeleteResponse = 0x52
    const val Ch2TeleportServerPending = 0x53
    const val Ch2TeleportClientPending = 0x54
    const val Ch2TeleportClientComplete = 0x55
    const val Ch2ServerError = 0x56
    const val Ch2ServerVersionCheck = 0x57
    const val Ch2ChannelPublishRequest = 0x58
    const val Ch2ChannelPublishResponse = 0x59
    const val Ch2ChannelJoinRequest = 0x5A
    const val Ch2ChannelJoinResponse = 0x5B
    const val Ch2ChannelUnpublish = 0x5C
    const val Ch2ConfigRequest = 0x5D
    const val Ch2ConfigResponse = 0x5E
    const val Ch2RelayData = 0x5F
    const val Ch2MemberList = 0x60
    const val Ch2MemberUpdate = 0x61
    const val Ch2ReloadEntitlements = 0x62
    const val Ch2UpdateTrionToken = 0x63
    const val Ch2AuthorizedClient = 0x64
    const val Ch2GatewayWrapper = 0x65
    const val Ch2GatewayBindRequest = 0x66
    const val Ch2GatewayBindResponse = 0x67
    const val Ch2GatewayBindChange = 0x68
    const val Ch2GatewayBindCancel = 0x69
    const val Ch2GatewayClientNotify = 0x6A
    const val Ch2DirectoryJoin = 0x6B
    const val Ch2DirectoryUpdate = 0x6C
    const val Ch2AccountLogout = 0x6D
    const val Ch2AssignGameWorld = 0x6E
    const val Ch2CreatePlayerRequest = 0x6F
    const val Ch2CreatePlayerResponse = 0x70
    const val Ch2DeletePlayer = 0x71
    const val Ch2ServerKill = 0x72
    const val Ch2InstanceJoinResponse = 0x73
    const val Ch2TeleportToInstance = 0x74
    const val Ch2InstancesAvailable = 0x75
    const val Ch2MatchCreate = 0x76
    const val Ch2MatchJoin = 0x77
    const val Ch2MatchLeave = 0x78
    const val Ch2MatchStart = 0x79
    const val Ch2MatchDataRequest = 0x7A
    const val Ch2MatchListResponse = 0x7B
    const val Ch2OpenWorldPvpLeave = 0x7C
    const val Ch2GroupUpdate = 0x7D
    const val Ch2GroupMemberUpdate = 0x7E
    const val Ch2GroupInviteRequestTo = 0x7F
    const val Ch2GroupInviteRequestFrom = 0x80
    const val Ch2GroupInviteResponseTo = 0x81
    const val Ch2GroupInviteResponseFrom = 0x82
    const val Ch2GroupQuit = 0x83
    const val Ch2GroupKick = 0x84
    const val Ch2GroupAppointLeader = 0x85
    const val Ch2GroupJoinLeader = 0x86
    const val Ch2ScoreBoardAlert = 0x87
    const val Ch2GlobalServerMessage = 0x88
    const val Ch2FriendListUpdate = 0x89
    const val Ch2FriendInviteRequestTo = 0x8A
    const val Ch2FriendInviteResponseTo = 0x8B
    const val Ch2FriendListRefreshReq = 0x8C
    const val Ch2FriendRemove = 0x8D
    const val Ch2FriendDetailsUpdate = 0x8E
    const val Ch2FriendListPost = 0x8F
    const val Ch2SetOnlineHandle = 0x90
    const val Ch2SetOnlineHandleResponse = 0x91
    const val Ch2KickPlayer = 0x92
    const val Ch2KickPlayerResponse = 0x93
    const val Ch2PlayerSocialStatusRequest = 0x94
    const val Ch2PlayerSocialStatusResponse = 0x95
    const val Ch2UpdatePrivilegeLevel = 0x96
    const val Ch2UpdatePrivilegeLevelResponse = 0x97
    const val Ch2BCTxAdd = 0x98
    const val Ch2BCTxUpdate = 0x99
    const val Ch2BCTxStart = 0x9A
    const val Ch2BCTxPurchase = 0x9B
    const val Ch2BCTxConsume = 0x9C
    const val Ch2BCTxComplete = 0x9D
    const val Ch2BCTxError = 0x9E
    const val Ch2ChatText = 0x9F
    const val Ch2ChatVoice = 0xA0
    const val Ch2ChatSetChannel = 0xA1
    const val Ch2ChatSenderDetails = 0xA2
    const val Ch2ChatSet = 0xA3
    const val Ch2GuildCreate = 0xA4
    const val Ch2GuildResponse = 0xA5
    const val Ch2GuildOperation = 0xA6
    const val Ch2GuildInviteRequestTo = 0xA7
    const val Ch2GuildInviteRequestFrom = 0xA8
    const val Ch2GuildInviteResponseTo = 0xA9
    const val Ch2GuildInviteResponseFrom = 0xAA
    const val Ch2GuildUpdateLogo = 0xAB
    const val Ch2GuildUpdateMotd = 0xAC
    const val Ch2BattleSrvrClientConnect = 0xAD
    const val Ch2BattleSrvrClientDisconnect = 0xAE
    const val Ch2BattleSrvrMatchJoin = 0xAF
    const val Ch2BattleSrvrMatchGroupJoin = 0xB0
    const val Ch2BattleSrvrMatchCreate = 0xB1
    const val Ch2BattleSrvrMatchGroupCreate = 0xB2
    const val Ch2BattleSrvrServerReady = 0xB3
    const val Ch2BattleSrvrPlayerLeave = 0xB4
    const val Ch2BattleSrvrPlayerUpdate = 0xB5
    const val Ch2BattleSrvrPlayerAddRemove = 0xB6
    const val Ch2BattleSrvrError = 0xB7
    const val Ch2BattleSrvrMatchStart = 0xB8
    const val Ch2BattleSrvrBgInitialize = 0xB9
    const val Ch2BattleSrvrGiInitialize = 0xBA
    const val Ch2BattleSrvrMatchClose = 0xBB
    const val Ch2BattleSrvrRequestPlayerUpdate = 0xBC
    const val Ch2BattleSrvrMatchListRequest = 0xBD
    const val Ch2BattleSrvrMatchList = 0xBE
    const val Ch2BattleSrvrAckPlayerAdd = 0xBF
    const val Ch2BattleSrvrMatchInitialize = 0xC0
    const val Ch2BattleSrvrMatchCreateOW = 0xC1
    const val Ch2BattleSrvrMatchStartOW = 0xC2
    const val Ch2BattleSrvrMatchDestroyOW = 0xC3
    const val Ch2BattleSrvrPlayerGroupInfo = 0xC4
    const val Ch2BattleSrvrRecoverClients = 0xC5
    const val Ch2BattleSrvrMatchViewUpdate = 0xC6
    const val Ch2SocialSrvrError = 0xC7
    const val Ch2SocialSrvrPlayerOnline = 0xC8
    const val Ch2SocialSrvrPlayerConnect = 0xC9
    const val Ch2SocialSrvrPlayerOffline = 0xCA
    const val Ch2SocialSrvrPlayerDisconnect = 0xCB
    const val Ch2SocialSrvrPlayerPost = 0xCC
    const val Ch2SocialSrvrGroupUpdate = 0xCD
    const val Ch2SocialSrvrGroupRemovePlayer = 0xCE
    const val Ch2SocialSrvrGroupSetLeader = 0xCF
    const val Ch2SocialSrvrGroupDisband = 0xD0
    const val Ch2SocialSrvrPlayerUpdate = 0xD1
    const val Ch2SocialSrvrRequestGroupUpdate = 0xD2
    const val Ch2SocialSrvrGroupMemberStats = 0xD3
    const val Ch2SocialSrvrGroupInviteRequestFrwd = 0xD4
    const val Ch2SocialSrvrGroupInviteResponseFrwd = 0xD5
    const val Ch2SocialSrvrPlayerMatchInfo = 0xD6
    const val Ch2SocialSrvrEventPlayerConnect = 0xD7
    const val Ch2SocialSrvrJoinPlayerRequest = 0xD8
    const val Ch2SocialSrvrJoinPlayerResponse = 0xD9
    const val Ch2SocialSrvrPlayerPostScore = 0xDA
    const val Ch2SocialSrvrPlayerScoreUpdate = 0xDB
    const val Ch2SocialSrvrServerInfo = 0xDC
    const val Ch2SocialSrvrGuildCreate = 0xDD
    const val Ch2SocialSrvrGuildRemove = 0xDE
    const val Ch2SocialSrvrGuildMemberUpdate = 0xDF
    const val Ch2SocialSrvrGuildInviteRequestFrwd = 0xE0
    const val Ch2SocialSrvrGuildUpdate = 0xE1
    const val Ch2SocialSrvrGuildBankAdd = 0xE2
    const val Ch2SocialSrvrGuildBankRemove = 0xE3
    const val Ch2SocialSrvrGuildBankResponse = 0xE4
    const val Ch2SocialSrvrGuildBankUpdate = 0xE5
    const val Ch2SocialSrvrFriendInviteReq = 0xE6
    const val Ch2SocialSrvrFriendInviteRes = 0xE7
    const val Ch2SocialSrvrFriendUpdate = 0xE8
    const val Ch2SocialSrvrFriendRemove = 0xE9
    const val Ch2SocialSrvrFriendListPost = 0xEA
    const val Ch2SocialSrvrQueryWorldForPlayer = 0xEB
    const val Ch2SocialSrvrWorldForPlayer = 0xEC
    const val Ch2SocialSrvrGuildAddBoost = 0xED
    const val Ch2SocialSrvrGuildBoostUpdate = 0xEE
    const val Ch2ScanProcessNames = 0xEF
    const val Ch2StartProcessRequest = 0xF0
    const val Ch2StartProcessResponse = 0xF1
    const val Ch2StopProcess = 0xF2
    const val Ch2ProcessStopped = 0xF3
    const val Ch2QueryLoadStats = 0xF4
    const val Ch2LoadStats = 0xF5
    const val Ch2NotifyDefunctProcess = 0xF6
    const val Ch2CharacterSelectAppearanceRequest = 247
    const val Ch2CharacterSelectAppearanceResponse = 248

    // TwnNetMsgFactory
    const val TwnEngineUdpConnect = 0
    const val TwnEngineUdpConnected = 1
    const val TwnEngineCryptChallenge = 7
    const val TwnEngineCryptResponse = 8
    const val TwnEngineLogLine = 10
    const val TwnEngineCrashInfo = 11
}