namespace TxMark.Templates {
    public class MeetingBallot : TxMark.Utilities.CHCompiledTemplateBase<dynamic> {
        public MeetingBallot() {
        }

        public TxMark.Template.IValue Hook_cf70db2a_20c2_4e6d_b963_dc6f978d1a0d(dynamic _this) {
            _this.Push();
#line 4 "MeetingBallot.txm"
            _this.Write("for you both.");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_20c5e018_447c_4f5c_8ac4_c23d1c660532(dynamic _this) {
            _this.Push();
#line 3 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator != true)
                _this.Write(Hook_cf70db2a_20c2_4e6d_b963_dc6f978d1a0d(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_a8fe9495_89ac_4bbe_8b93_afc9e3ff11d6(dynamic _this) {
            _this.Push();
#line 7 "MeetingBallot.txm"
            _this.Write("with");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_8419d81c_9950_4372_b769_ba6c92ccda7d(dynamic _this) {
            _this.Push();
#line 8 "MeetingBallot.txm"
            _this.Write("with you and");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_2238cf70_8383_4bfd_a94d_bfbab5de042f(dynamic _this) {
            _this.Push();
#line 6 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator == true)
                _this.Write(Hook_a8fe9495_89ac_4bbe_8b93_afc9e3ff11d6(_this));
            else
                _this.Write(Hook_8419d81c_9950_4372_b769_ba6c92ccda7d(_this));
            _this.Write("\r\n");
            _this.Write(CasualDisplayName(Index("otherAttendees", 1)));
            _this.Write(".\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_3779b60d_861d_4174_a180_51bf19e51e49(dynamic _this) {
            _this.Push();
#line 12 "MeetingBallot.txm"
            _this.Write("with");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_563ca60e_5af2_4937_a8f3_a06c97f6123f(dynamic _this) {
            _this.Push();
#line 13 "MeetingBallot.txm"
            _this.Write("with you ");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_427eea32_b13e_4184_b007_3d2398d5dfa6(dynamic _this) {
            _this.Push();
#line 11 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator == true)
                _this.Write(Hook_3779b60d_861d_4174_a180_51bf19e51e49(_this));
            else
                _this.Write(Hook_563ca60e_5af2_4937_a8f3_a06c97f6123f(_this));
            _this.Write("\r\n");
            _this.Write(CasualDisplayName(Index(_this.Model.OtherAttendees, 1)));
            _this.Write(", and ");
            _this.Write(CasualDisplayName(Index(_this.Model.OtherAttendees, 2)));
            _this.Write(".\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_c239fea7_e103_4e22_bde9_13dc38a04e60(dynamic _this) {
            _this.Push();
#line 17 "MeetingBallot.txm"
            _this.Write("with ");
            _this.Write(CasualDisplayName(Index(_this.Model.OtherAttendees, 1)));
            _this.Write(", ");
            _this.Write(CasualDisplayName(Index(_this.Model.OtherAttendees, 2)));
            _this.Write(", and others.");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_168d53aa_369f_41c7_8cb0_e55aab7a0b9a(dynamic _this) {
            _this.Push();
#line 18 "MeetingBallot.txm"
            _this.Write("with you, ");
            _this.Write(CasualDisplayName(Index(_this.Model.OtherAttendees, 1)));
            _this.Write(", and others.");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_312cce01_49b9_4e85_9a0a_a91f68d6209b(dynamic _this) {
            _this.Push();
#line 16 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator == true)
                _this.Write(Hook_c239fea7_e103_4e22_bde9_13dc38a04e60(_this));
            else
                _this.Write(Hook_168d53aa_369f_41c7_8cb0_e55aab7a0b9a(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_6c3d12c5_1d43_4662_9ae1_44cce940464e(dynamic _this) {
            _this.Push();
#line 1 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (2 == Index(_this.Model.OtherAttendees, "length"))
                _this.Write(Hook_427eea32_b13e_4184_b007_3d2398d5dfa6(_this));
            else if (1 == Index(_this.Model.OtherAttendees, "length"))
                _this.Write(Hook_2238cf70_8383_4bfd_a94d_bfbab5de042f(_this));
            else if (0 == Index(_this.Model.OtherAttendees, "length"))
                _this.Write(Hook_20c5e018_447c_4f5c_8ac4_c23d1c660532(_this));
            else
                _this.Write(Hook_312cce01_49b9_4e85_9a0a_a91f68d6209b(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_df9151fb_dd0a_480d_b94e_ee852d1ee432(dynamic _this) {
            _this.Push();
#line 23 "MeetingBallot.txm"
            _this.Write("your calendar");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_08bfc740_63a1_466a_8b62_3a0fb2cd313d(dynamic _this) {
            _this.Push();
#line 24 "MeetingBallot.txm"
            _this.Write("both of your calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_5364ff42_53d1_4d54_9e37_79ba0303a10b(dynamic _this) {
            _this.Push();
#line 22 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator == true)
                _this.Write(Hook_df9151fb_dd0a_480d_b94e_ee852d1ee432(_this));
            else
                _this.Write(Hook_08bfc740_63a1_466a_8b62_3a0fb2cd313d(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_b68e11b5_c2c0_4310_ab60_9b4727460293(dynamic _this) {
            _this.Push();
#line 27 "MeetingBallot.txm"
            _this.Write("both of your calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_df700a4b_af6f_4280_9031_6434e39dce54(dynamic _this) {
            _this.Push();
#line 28 "MeetingBallot.txm"
            _this.Write("all of calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_b800e9bb_5b6c_4ce4_a6df_70077088d2cb(dynamic _this) {
            _this.Push();
#line 26 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator == true)
                _this.Write(Hook_b68e11b5_c2c0_4310_ab60_9b4727460293(_this));
            else
                _this.Write(Hook_df700a4b_af6f_4280_9031_6434e39dce54(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_eb7f509f_5c9a_450f_aa93_e00ea4fd8de0(dynamic _this) {
            _this.Push();
#line 30 "MeetingBallot.txm"
            _this.Write("all of your calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_7d717d18_9a9b_48e2_a618_3359f8f7158c(dynamic _this) {
            _this.Push();
#line 21 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.OtherAttendees == null || Index(_this.Model.OtherAttendees, "length") == 0)
                _this.Write(Hook_5364ff42_53d1_4d54_9e37_79ba0303a10b(_this));
            else if (Index(_this.Model.OtherAttendees, "length") == 1)
                _this.Write(Hook_b800e9bb_5b6c_4ce4_a6df_70077088d2cb(_this));
            else
                _this.Write(Hook_eb7f509f_5c9a_450f_aa93_e00ea4fd8de0(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_70dcdbf5_06f9_4735_bbb3_e1101f0ecc42(dynamic _this) {
            _this.Push();
#line 33 "MeetingBallot.txm"
            _this.Write(" and ");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_ebabb23b_f0e9_48e6_bc01_342a39b7dbf2(dynamic _this) {
            _this.Push();
#line 33 "MeetingBallot.txm"
            _this.Write("meeting ");
            if (Text(Index(_this.Model.location, "RemoteLocationType")) == "None")
                _this.Write(Hook_70dcdbf5_06f9_4735_bbb3_e1101f0ecc42(_this));
            _this.Write(" ");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_6e7b1741_6196_46d9_9cd0_64b45e386ba1(dynamic _this) {
            _this.Push();
#line 35 "MeetingBallot.txm"
            _this.Write("phone call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_c064bb9f_b96d_4af3_b174_e4331b92b79b(dynamic _this) {
            _this.Push();
#line 36 "MeetingBallot.txm"
            _this.Write("Skype call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_8f162c6e_9c3b_4894_b0a2_ac61eb065a03(dynamic _this) {
            _this.Push();
#line 37 "MeetingBallot.txm"
            _this.Write("Google Hangout");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_f2e813cd_a745_44b3_895c_e196df8060ce(dynamic _this) {
            _this.Push();
#line 38 "MeetingBallot.txm"
            _this.Write("conference call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_55dd214c_50e5_4b86_b738_ee68585e1bc9(dynamic _this) {
            _this.Push();
#line 39 "MeetingBallot.txm"
            _this.Write("online meeting");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_5b20137b_b094_41e8_9fbe_75a1c8fe618a(dynamic _this) {
            _this.Push();
#line 41 "MeetingBallot.txm"
            _this.Write("meeting");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_babfebcc_74de_4115_8aea_0406d4d697d3(dynamic _this) {
            _this.Push();
#line 40 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.Location, "IsInPerson") != true)
                _this.Write(Hook_5b20137b_b094_41e8_9fbe_75a1c8fe618a(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_ac0c28b9_f888_4135_af46_277667991e8c(dynamic _this) {
            _this.Push();
#line 32 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.location, "IsInPerson"))
                _this.Write(Hook_ebabb23b_f0e9_48e6_bc01_342a39b7dbf2(_this));
            _this.Write("\r\n");
            if ("Other" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_55dd214c_50e5_4b86_b738_ee68585e1bc9(_this));
            else if ("ConferenceCall" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_f2e813cd_a745_44b3_895c_e196df8060ce(_this));
            else if ("Hangout" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_8f162c6e_9c3b_4894_b0a2_ac61eb065a03(_this));
            else if ("Skype" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_c064bb9f_b96d_4af3_b174_e4331b92b79b(_this));
            else if ("Phone" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_6e7b1741_6196_46d9_9cd0_64b45e386ba1(_this));
            else
                _this.Write(Hook_babfebcc_74de_4115_8aea_0406d4d697d3(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_30470fe3_3502_4817_ae45_7f4d5becfc92(dynamic _this) {
            _this.Push();
#line 46 "MeetingBallot.txm"
            _this.Write("phone");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_f3d278c3_33f5_47b2_848f_85bb5a52730e(dynamic _this) {
            _this.Push();
#line 47 "MeetingBallot.txm"
            _this.Write("Skype");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_fb268974_3d42_4ac9_a7c4_ba52505148f5(dynamic _this) {
            _this.Push();
#line 48 "MeetingBallot.txm"
            _this.Write("Google Hangout");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_32b6dc81_9b78_4c8a_b4a1_0a1ae7a87dc3(dynamic _this) {
            _this.Push();
#line 49 "MeetingBallot.txm"
            _this.Write("conference call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_964d35bf_8c5e_41e5_892d_d4c7dc6a1e3c(dynamic _this) {
            _this.Push();
#line 44 "MeetingBallot.txm"
            _this.Write("\r\n");
            if ("ConferenceCall" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_32b6dc81_9b78_4c8a_b4a1_0a1ae7a87dc3(_this));
            else if ("Hangout" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_fb268974_3d42_4ac9_a7c4_ba52505148f5(_this));
            else if ("Skype" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_f3d278c3_33f5_47b2_848f_85bb5a52730e(_this));
            else if ("Phone" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_30470fe3_3502_4817_ae45_7f4d5becfc92(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_ff00750f_cef7_41b1_a8bd_7bf00bbb9941(dynamic _this) {
            _this.Push();
#line 53 "MeetingBallot.txm"
            _this.Write("phone number");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_1fec9d92_6349_48f0_93ac_bd87daa33e23(dynamic _this) {
            _this.Push();
#line 54 "MeetingBallot.txm"
            _this.Write("Skype address");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_90bfb475_8a75_4e55_ad01_b55148a11606(dynamic _this) {
            _this.Push();
#line 55 "MeetingBallot.txm"
            _this.Write("gmail address");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_f78fbbd7_c11f_4b84_a523_210047dcc38d(dynamic _this) {
            _this.Push();
#line 51 "MeetingBallot.txm"
            _this.Write("\r\n");
            if ("Hangout" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_90bfb475_8a75_4e55_ad01_b55148a11606(_this));
            else if ("Skype" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_1fec9d92_6349_48f0_93ac_bd87daa33e23(_this));
            else if ("Phone" == Text(Index(_this.Model.Location, "RemoteLocationType")))
                _this.Write(Hook_ff00750f_cef7_41b1_a8bd_7bf00bbb9941(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_0a86a2e4_1017_4d5a_9d13_91dbf9892074(dynamic _this) {
            _this.Push();
#line 59 "MeetingBallot.txm"
            _this.Write("The meeting will be held at ");
            _this.Write(Print(Index(_this.Model.Location, "MeetingLocation")));
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_5d847b91_0493_46ed_b32f_d426409da11d(dynamic _this) {
            _this.Push();
#line 57 "MeetingBallot.txm"
            _this.Write("\r\nMeet at FUBAR\r\n");
            if (_this.Model.Location == true && Index(Index(_this.Model.Location, "MeetingLocation"), "length") != 0)
                _this.Write(Hook_0a86a2e4_1017_4d5a_9d13_91dbf9892074(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_8e4b3e64_217d_4083_889b_915020301dda(dynamic _this) {
            _this.Push();
#line 63 "MeetingBallot.txm"
            _this.Write("also");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_4099e50a_e889_4f79_9014_cf05369200d4(dynamic _this) {
            _this.Push();
#line 65 "MeetingBallot.txm"
            _this.Write("\r\n");
            _this.Write(CasualDisplayName(Index(_this.Model.OtherAttendees, 1)));
            _this.Write(" knows;\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_6187ca5f_a116_4735_8e81_c191a4d0121a(dynamic _this) {
            _this.Push();
#line 68 "MeetingBallot.txm"
            _this.Write("the others know");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_fbfd4333_43fe_40e6_86cd_4a41c89c57d3(dynamic _this) {
            _this.Push();
#line 64 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.OtherAttendees, "length") == 1)
                _this.Write(Hook_4099e50a_e889_4f79_9014_cf05369200d4(_this));
            else
                _this.Write(Hook_6187ca5f_a116_4735_8e81_c191a4d0121a(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_461d067c_9ab3_4ac6_85ff_6f068dba250f(dynamic _this) {
            _this.Push();
#line 70 "MeetingBallot.txm"
            _this.Write(CasualDisplayName(Index(_this.Model.Location, "Originator")));
            _this.Write(" knows");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_2c3ae3f9_eddc_4c61_9413_6d0dfac8ace5(dynamic _this) {
            _this.Push();
#line 71 "MeetingBallot.txm"
            _this.Write(CasualDisplayName(_this.Model.Creator));
            _this.Write(" knows");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_a7f3c196_41b0_450d_849a_4c8f535d6652(dynamic _this) {
            _this.Push();
#line 62 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 63 "MeetingBallot.txm"
                _this.Write("Kindly ");
                if (_this.Model.NeedsTimeInfo == true)
                    _this.Write(Hook_8e4b3e64_217d_4083_889b_915020301dda(_this));
                _this.Write(" ");
                if (_this.WriteOpenTag("strong", false, null))
                {
#line 63 "MeetingBallot.txm"
                    _this.Write("provide your preferred ");
                    _this.Write(Hook_f78fbbd7_c11f_4b84_a523_210047dcc38d(_this));
                    _this.WriteCloseTag("strong");
                }

                _this.Write(", so that\r\n");
                if (_this.Model.IsCreator == true)
                    _this.Write(Hook_fbfd4333_43fe_40e6_86cd_4a41c89c57d3(_this));
                else if (Index(Index(_this.Model.Location, "Originator"), "length") == 0)
                    _this.Write(Hook_461d067c_9ab3_4ac6_85ff_6f068dba250f(_this));
                else
                    _this.Write(Hook_2c3ae3f9_eddc_4c61_9413_6d0dfac8ace5(_this));
                _this.Write("\r\nhow to reach you.\r\n");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_ae45b389_acf2_43d6_a39c_7ab6f6c16d92(dynamic _this) {
            _this.Push();
#line 61 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.NeedsContactInfo == true)
                _this.Write(Hook_a7f3c196_41b0_450d_849a_4c8f535d6652(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_7985012f_4e24_4506_970c_8df3134562a2(dynamic _this) {
            _this.Push();
#line 77 "MeetingBallot.txm"
            _this.Write("Hi ");
            _this.Write(Print(Index(_this.Model.Recipient, "FirstName")));
            _this.Write(",");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_d0b6fa4d_a5b6_4bd5_904b_ee5cf1b4969e(dynamic _this) {
            _this.Push();
#line 78 "MeetingBallot.txm"
            _this.Write("Hi,");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_2d6c8205_eecf_45f6_8be7_52c67e5868ce(dynamic _this) {
            _this.Push();
#line 82 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 83 "MeetingBallot.txm"
                _this.Write("I've picked a few possible times for a ");
                _this.Write(DurationInMinutes(_this.Model.DurationInMinutes));
                _this.Write(" ");
                _this.Write(Hook_ac0c28b9_f888_4135_af46_277667991e8c(_this));
                _this.Write(" ");
                _this.Write(Hook_6c3d12c5_1d43_4662_9ae1_44cce940464e(_this));
                _this.Write(" ");
                _this.Write(Hook_5d847b91_0493_46ed_b32f_d426409da11d(_this));
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_c19e82fc_451b_4f01_b00c_700517b48a68(dynamic _this) {
            _this.Push();
#line 85 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 86 "MeetingBallot.txm"
                _this.Write("I've picked a few possible times for a ");
                _this.Write(DurationInMinutes(_this.Model.DurationInMinutes));
                _this.Write(" ");
                _this.Write(Hook_ac0c28b9_f888_4135_af46_277667991e8c(_this));
                _this.Write(". ");
                _this.Write(Hook_5d847b91_0493_46ed_b32f_d426409da11d(_this));
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_bcfe9772_99d1_4f97_bda9_ea2670a86284(dynamic _this) {
            _this.Push();
#line 89 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("li", false, null))
            {
#line 90 "MeetingBallot.txm"
                _this.Write(AddUnicodeToDatetime(_this.option));
                _this.Write(" ");
                _this.Write(_this.Model.TimeZone);
                _this.WriteCloseTag("li");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_67dfc9e1_c335_426d_ad4b_f21e8b80fda6(dynamic _this) {
            _this.Push();
#line 81 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.OtherAttendees, "length") > 0)
                _this.Write(Hook_2d6c8205_eecf_45f6_8be7_52c67e5868ce(_this));
            else
                _this.Write(Hook_c19e82fc_451b_4f01_b00c_700517b48a68(_this));
            _this.Write("\r\n");
            if (_this.WriteOpenTag("ul", false, null))
            {
#line 88 "MeetingBallot.txm"
                _this.Write("\r\n");
                foreach (var _it_0 in _this.Model.TimeOptions)
                {
                    _this.option = _it_0;
                    _this.Write(Hook_bcfe9772_99d1_4f97_bda9_ea2670a86284(_this));
                }

                _this.Write("\r\n");
                _this.WriteCloseTag("ul");
            }

            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 93 "MeetingBallot.txm"
                _this.Write("Please let me know all the times that work for you as soon as you get a chance, so I can get it scheduled.");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_76c8c367_a984_4539_913c_5dd22fcb0a67(dynamic _this) {
            _this.Push();
#line 98 "MeetingBallot.txm"
            _this.Write(DurationInMinutes(_this.Model.DurationInMinutes));
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_53fde2d3_a81b_48fa_a018_01c511f484cf(dynamic _this) {
            _this.Push();
#line 100 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 101 "MeetingBallot.txm"
                _this.Write("\r\n");
                _this.Write(CasualDisplayName(_this.Model.Creator));
                _this.Write(" is available on ");
                _this.Write(AddUnicodeToDatetime(Index(_this.Model.TimeOptions, 1)));
                _this.Write(" ");
                _this.Write(_this.Model.TimeZone);
                _this.Write(".\r\nDoes this work for you ?\r\n");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_1e28fe2b_a0ee_4aae_af8d_cdb68fc59758(dynamic _this) {
            _this.Push();
#line 108 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("li", false, null))
            {
#line 109 "MeetingBallot.txm"
                _this.Write(AddUnicodeToDatetime(_this.option));
                _this.Write(" ");
                _this.Write(_this.Model.TimeZone);
                _this.WriteCloseTag("li");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_063f762a_7a88_47fc_ae1c_5dbec03a1c23(dynamic _this) {
            _this.Push();
#line 106 "MeetingBallot.txm"
            if (_this.WriteOpenTag("p", false, null))
            {
#line 106 "MeetingBallot.txm"
                _this.Write("Below are some proposed times when ");
                _this.Write(CasualDisplayName(_this.Model.Creator));
                _this.Write(" is available.");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            if (_this.WriteOpenTag("ul", false, null))
            {
#line 107 "MeetingBallot.txm"
                _this.Write("\r\n");
                foreach (var _it_1 in _this.Model.TimeOptions)
                {
                    _this.option = _it_1;
                    _this.Write(Hook_1e28fe2b_a0ee_4aae_af8d_cdb68fc59758(_this));
                }

                _this.Write("\r\n");
                _this.WriteCloseTag("ul");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_84b1f6f8_20ce_4dce_9d9c_8e73cd64285b(dynamic _this) {
            _this.Push();
#line 113 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 114 "MeetingBallot.txm"
                _this.Write("Let me know as soon as you can so I can lock in a time on ");
                _this.Write(Hook_7d717d18_9a9b_48e2_a618_3359f8f7158c(_this));
                _this.Write(".");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_3bf1d719_4543_4363_a998_31d5c1aa3c33(dynamic _this) {
            _this.Push();
#line 116 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 117 "MeetingBallot.txm"
                _this.Write("Please let me know all the times that work for you, so I can lock in the best time on ");
                _this.Write(Hook_7d717d18_9a9b_48e2_a618_3359f8f7158c(_this));
                _this.Write(".");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_5f1ca53d_10d8_40be_9c24_c4964908218c(dynamic _this) {
            _this.Push();
#line 95 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 96 "MeetingBallot.txm"
                _this.Write("\r\nI'm helping ");
                _this.Write(DisplayName(_this.Model.Creator));
                _this.Write(" schedule a\r\n");
                if (_this.Model.NeedsTimeInfo)
                    _this.Write(Hook_76c8c367_a984_4539_913c_5dd22fcb0a67(_this));
                _this.Write(" ");
                _this.Write(Hook_ac0c28b9_f888_4135_af46_277667991e8c(_this));
                _this.Write(" ");
                _this.Write(Hook_6c3d12c5_1d43_4662_9ae1_44cce940464e(_this));
                _this.Write("\r\n");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            if (Index(_this.Model.TimeOptions, "length") == 1)
                _this.Write(Hook_53fde2d3_a81b_48fa_a018_01c511f484cf(_this));
            else
                _this.Write(Hook_063f762a_7a88_47fc_ae1c_5dbec03a1c23(_this));
            _this.Write("\r\n");
            if (Index(_this.Model.TimeOptions, "length") == 1)
                _this.Write(Hook_84b1f6f8_20ce_4dce_9d9c_8e73cd64285b(_this));
            else
                _this.Write(Hook_3bf1d719_4543_4363_a998_31d5c1aa3c33(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_d372f713_bdff_47b1_9ca4_fd08c9f0efaa(dynamic _this) {
            _this.Push();
#line 80 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator == true)
                _this.Write(Hook_67dfc9e1_c335_426d_ad4b_f21e8b80fda6(_this));
            else
                _this.Write(Hook_5f1ca53d_10d8_40be_9c24_c4964908218c(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_74a89455_4fd7_4bcb_a079_6c1a1ae9b14d(dynamic _this) {
            _this.Push();
#line 122 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 123 "MeetingBallot.txm"
                _this.Write("I'm working on a ");
                _this.Write(Hook_ac0c28b9_f888_4135_af46_277667991e8c(_this));
                _this.Write(" for you.");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_45fec2fd_f83d_4a50_a07a_4978f14d184b(dynamic _this) {
            _this.Push();
#line 125 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 126 "MeetingBallot.txm"
                _this.Write("I'm helping ");
                _this.Write(DisplayName(_this.Model.Creator));
                _this.Write(" schedule a ");
                _this.Write(DurationInMinutes(_this.Model.DurationInMinutes));
                _this.Write(" ");
                _this.Write(Hook_ac0c28b9_f888_4135_af46_277667991e8c(_this));
                _this.Write(" ");
                _this.Write(Hook_6c3d12c5_1d43_4662_9ae1_44cce940464e(_this));
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_f5e4a9a5_873e_4a26_ad05_f7eb1d8c6073(dynamic _this) {
            _this.Push();
#line 121 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator == true)
                _this.Write(Hook_74a89455_4fd7_4bcb_a079_6c1a1ae9b14d(_this));
            else
                _this.Write(Hook_45fec2fd_f83d_4a50_a07a_4978f14d184b(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public override TxMark.Template.IValue View(dynamic _this) {
            _this.Push();
#line 1 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 76 "MeetingBallot.txm"
                _this.Write("\r\n");
                if (Index((Index(_this.Model.Recipient, "FirstName")), "length") > 0)
                    _this.Write(Hook_7985012f_4e24_4506_970c_8df3134562a2(_this));
                else
                    _this.Write(Hook_d0b6fa4d_a5b6_4bd5_904b_ee5cf1b4969e(_this));
                _this.Write("\r\n");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            if (_this.Model.NeedsTimeInfo == true)
                _this.Write(Hook_d372f713_bdff_47b1_9ca4_fd08c9f0efaa(_this));
            else
                _this.Write(Hook_f5e4a9a5_873e_4a26_ad05_f7eb1d8c6073(_this));
            _this.Write("\r\n");
            _this.Write(Hook_ae45b389_acf2_43d6_a39c_7ab6f6c16d92(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }
    }
}