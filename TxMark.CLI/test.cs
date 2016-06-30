namespace TxMark.Templates
{
    public class MeetingBallot : TxMark.Utilities.CHCompiledTemplateBase<dynamic>
    {
        public MeetingBallot()
        {
        }

        public TxMark.Template.IValue Hook_e54c50f9_5222_4aea_8a06_8a550bea9ac0(dynamic _this)
        {
            _this.Push();
#line 3 "MeetingBallot.txm"
            _this.Write("for you both.");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_0808bd5f_4630_4454_92ff_3672e717a2e5(dynamic _this)
        {
            _this.Push();
#line 2 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator != true)
                _this.Write(Hook_e54c50f9_5222_4aea_8a06_8a550bea9ac0(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_6d81c5c8_ec86_49a6_81d4_86921d864f59(dynamic _this)
        {
            _this.Push();
#line 6 "MeetingBallot.txm"
            _this.Write("with");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_bf16c52a_3393_492a_a761_f7463be2e751(dynamic _this)
        {
            _this.Push();
#line 7 "MeetingBallot.txm"
            _this.Write("with you and");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_59d2a8e2_c270_4a3d_a67b_67536855bc20(dynamic _this)
        {
            _this.Push();
#line 5 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_6d81c5c8_ec86_49a6_81d4_86921d864f59(_this));
            else
                _this.Write(Hook_bf16c52a_3393_492a_a761_f7463be2e751(_this));
            _this.Write("\r\n");
            _this.Write(CasualDisplayName(Index("otherAttendees", 1)));
            _this.Write(".\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_e4adebbd_cf29_43a1_bd98_7133006aec1c(dynamic _this)
        {
            _this.Push();
#line 11 "MeetingBallot.txm"
            _this.Write("with");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_2f10b76b_8c23_408d_be98_aa485de78688(dynamic _this)
        {
            _this.Push();
#line 12 "MeetingBallot.txm"
            _this.Write("with you ");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_1625704b_5ac0_44a9_ab63_e93b54246603(dynamic _this)
        {
            _this.Push();
#line 10 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_e4adebbd_cf29_43a1_bd98_7133006aec1c(_this));
            else
                _this.Write(Hook_2f10b76b_8c23_408d_be98_aa485de78688(_this));
            _this.Write("\r\n");
            _this.Write(CasualDisplayName(Index("otherAttendees", 1)));
            _this.Write(", and ");
            _this.Write(CasualDisplayName(Index("otherAttendees", 2)));
            _this.Write(".\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_50b20891_6252_4af6_8fdf_db10a9a3fda6(dynamic _this)
        {
            _this.Push();
#line 16 "MeetingBallot.txm"
            _this.Write("with ");
            _this.Write(CasualDisplayName(Index("otherAttendees", 1)));
            _this.Write(", ");
            _this.Write(CasualDisplayName(Index("otherAttendees", 2)));
            _this.Write(", and others.");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_f2f7c992_031f_4c72_8b4e_536348c35761(dynamic _this)
        {
            _this.Push();
#line 17 "MeetingBallot.txm"
            _this.Write("with you, ");
            _this.Write(CasualDisplayName(Index("otherAttendees", 1)));
            _this.Write(", and others.");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_4a801cd7_b02b_48e3_9569_60da5d7dab86(dynamic _this)
        {
            _this.Push();
#line 15 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_50b20891_6252_4af6_8fdf_db10a9a3fda6(_this));
            else
                _this.Write(Hook_f2f7c992_031f_4c72_8b4e_536348c35761(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_c6085d42_d2ab_46eb_973c_9c9cb3927b8a(dynamic _this)
        {
            _this.Push();
#line 1 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.otherAttendees == null || Index("otherAttendees", "length") == 0)
                _this.Write(Hook_0808bd5f_4630_4454_92ff_3672e717a2e5(_this));
            else if (Index(_this.Model.otherAttendees, "length") == 1)
                _this.Write(Hook_59d2a8e2_c270_4a3d_a67b_67536855bc20(_this));
            else if (Index(_this.Model.otherAttendees, "length") == 2)
                _this.Write(Hook_1625704b_5ac0_44a9_ab63_e93b54246603(_this));
            else
                _this.Write(Hook_4a801cd7_b02b_48e3_9569_60da5d7dab86(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_5fbd6fd5_15c1_4c0a_a313_2074c8dc3491(dynamic _this)
        {
            _this.Push();
#line 23 "MeetingBallot.txm"
            _this.Write("your calendar");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_396393f6_c42d_48ae_a41d_62f3b7786d8c(dynamic _this)
        {
            _this.Push();
#line 24 "MeetingBallot.txm"
            _this.Write("both of your calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_a9787eeb_b557_450a_83ac_fe528d03a561(dynamic _this)
        {
            _this.Push();
#line 22 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_5fbd6fd5_15c1_4c0a_a313_2074c8dc3491(_this));
            else
                _this.Write(Hook_396393f6_c42d_48ae_a41d_62f3b7786d8c(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_6427c8be_b035_470b_b660_5fd2fd3b350c(dynamic _this)
        {
            _this.Push();
#line 27 "MeetingBallot.txm"
            _this.Write("both of your calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_429b5c70_d830_4921_8f68_a63cdca2076e(dynamic _this)
        {
            _this.Push();
#line 28 "MeetingBallot.txm"
            _this.Write("all of calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_bccc70d0_1899_4b24_9c76_62067552cd3c(dynamic _this)
        {
            _this.Push();
#line 26 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_6427c8be_b035_470b_b660_5fd2fd3b350c(_this));
            else
                _this.Write(Hook_429b5c70_d830_4921_8f68_a63cdca2076e(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_6a9f6abf_cf7b_4f57_9190_27d77e5cc1ed(dynamic _this)
        {
            _this.Push();
#line 30 "MeetingBallot.txm"
            _this.Write("all of your calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_77c40cdf_8425_499c_8440_7d2312974e33(dynamic _this)
        {
            _this.Push();
#line 21 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.otherAttendees == null || Index(_this.Model.otherAttendees, "length") == 0)
                _this.Write(Hook_a9787eeb_b557_450a_83ac_fe528d03a561(_this));
            else if (Index(_this.Model.otherAttendees, "length") == 1)
                _this.Write(Hook_bccc70d0_1899_4b24_9c76_62067552cd3c(_this));
            else
                _this.Write(Hook_6a9f6abf_cf7b_4f57_9190_27d77e5cc1ed(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_b5435faf_a9c1_4172_bdfc_f93d38c1402a(dynamic _this)
        {
            _this.Push();
#line 34 "MeetingBallot.txm"
            _this.Write(" and ");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_9daf379c_760c_4126_851c_ee53f687195c(dynamic _this)
        {
            _this.Push();
#line 34 "MeetingBallot.txm"
            _this.Write("meeting ");
            if (Index(_this.Model.location, "RemoteLocationType") == "None")
                _this.Write(Hook_b5435faf_a9c1_4172_bdfc_f93d38c1402a(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_9f7d9af0_e4bc_45d1_a372_f614e7267065(dynamic _this)
        {
            _this.Push();
#line 37 "MeetingBallot.txm"
            _this.Write("phone call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_ed593632_7c1f_4057_ac76_ef3f1b12ffb0(dynamic _this)
        {
            _this.Push();
#line 38 "MeetingBallot.txm"
            _this.Write("Skype call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_8ba21442_dd12_42b2_84b8_d44df11c2308(dynamic _this)
        {
            _this.Push();
#line 39 "MeetingBallot.txm"
            _this.Write("Google Hangout");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_baab783f_a702_42aa_b259_7d7017a42ca0(dynamic _this)
        {
            _this.Push();
#line 40 "MeetingBallot.txm"
            _this.Write("conference call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_fa79cd5b_78df_486c_bc8c_c7fc93bc18e7(dynamic _this)
        {
            _this.Push();
#line 41 "MeetingBallot.txm"
            _this.Write("online meeting");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_69c4cc54_f7c4_4ee9_8241_1d3f686591b4(dynamic _this)
        {
            _this.Push();
#line 42 "MeetingBallot.txm"
            _this.Write("meeting");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_b7ec5035_8456_4d4e_b366_7adec4108107(dynamic _this)
        {
            _this.Push();
#line 42 "MeetingBallot.txm"
            if (Index(_this.Model.Location, "IsInPerson") != true)
                _this.Write(Hook_69c4cc54_f7c4_4ee9_8241_1d3f686591b4(_this));
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_2461cdb2_7032_42e8_9031_54bd95e33b12(dynamic _this)
        {
            _this.Push();
#line 33 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.location, "IsInPerson"))
                _this.Write(Hook_9daf379c_760c_4126_851c_ee53f687195c(_this));
            _this.Write("\r\n");
            if ("Other" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_fa79cd5b_78df_486c_bc8c_c7fc93bc18e7(_this));
            else if ("ConferenceCall" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_baab783f_a702_42aa_b259_7d7017a42ca0(_this));
            else if ("Hangout" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_8ba21442_dd12_42b2_84b8_d44df11c2308(_this));
            else if ("Skype" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_ed593632_7c1f_4057_ac76_ef3f1b12ffb0(_this));
            else if ("Phone" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_9f7d9af0_e4bc_45d1_a372_f614e7267065(_this));
            else
                _this.Write(Hook_b7ec5035_8456_4d4e_b366_7adec4108107(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_b29da8c9_1410_4513_a5b5_f02139539f6c(dynamic _this)
        {
            _this.Push();
#line 47 "MeetingBallot.txm"
            _this.Write("phone");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_647398ab_a878_4488_a331_4d7cd665eeb9(dynamic _this)
        {
            _this.Push();
#line 48 "MeetingBallot.txm"
            _this.Write("Skype");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_69226c48_c740_4dc2_813d_f315f49ccd64(dynamic _this)
        {
            _this.Push();
#line 49 "MeetingBallot.txm"
            _this.Write("Google Hangout");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_d6640444_cf55_47b5_98c1_d9788f0803df(dynamic _this)
        {
            _this.Push();
#line 50 "MeetingBallot.txm"
            _this.Write("conference call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_641a4a3d_fcce_46a8_a18b_4daeebd30eba(dynamic _this)
        {
            _this.Push();
#line 45 "MeetingBallot.txm"
            _this.Write("\r\n");
            if ("ConferenceCall" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_d6640444_cf55_47b5_98c1_d9788f0803df(_this));
            else if ("Hangout" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_69226c48_c740_4dc2_813d_f315f49ccd64(_this));
            else if ("Skype" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_647398ab_a878_4488_a331_4d7cd665eeb9(_this));
            else if ("Phone" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_b29da8c9_1410_4513_a5b5_f02139539f6c(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_290475dc_654a_43bf_b487_e261c580403e(dynamic _this)
        {
            _this.Push();
#line 55 "MeetingBallot.txm"
            _this.Write("phone number");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_7d3fd9c3_e029_458e_83ab_908d25439cdc(dynamic _this)
        {
            _this.Push();
#line 56 "MeetingBallot.txm"
            _this.Write("Skype address");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_e2948378_257a_454c_90ee_04a99163cf66(dynamic _this)
        {
            _this.Push();
#line 57 "MeetingBallot.txm"
            _this.Write("gmail address");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_149dff8a_5290_4350_99a8_dfa1745fffb4(dynamic _this)
        {
            _this.Push();
#line 53 "MeetingBallot.txm"
            _this.Write("\r\n");
            if ("Hangout" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_e2948378_257a_454c_90ee_04a99163cf66(_this));
            else if ("Skype" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_7d3fd9c3_e029_458e_83ab_908d25439cdc(_this));
            else if ("Phone" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_290475dc_654a_43bf_b487_e261c580403e(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_73e43b43_1e37_4bb8_8a22_a18b7ab2aa28(dynamic _this)
        {
            _this.Push();
#line 61 "MeetingBallot.txm"
            _this.Write("The meeting will be held at ");
            _this.Write(Print(Index(_this.Model.Location, "MeetingLocation")));
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_628e2058_db28_4611_a574_68f7322cd42c(dynamic _this)
        {
            _this.Push();
#line 60 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.Location, "IsInPerson") && Index((Index(_this.Model.Location, "MeetingLocation")), "length") == 0)
                _this.Write(Hook_73e43b43_1e37_4bb8_8a22_a18b7ab2aa28(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_b50f84b2_1cc6_4be8_a77b_a7e84e2f006e(dynamic _this)
        {
            _this.Push();
#line 66 "MeetingBallot.txm"
            _this.Write("also");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_271b2a2a_77ca_4358_b996_43fc82766d2b(dynamic _this)
        {
            _this.Push();
#line 68 "MeetingBallot.txm"
            _this.Write("\r\n");
            _this.Write(CasualDisplayName(Index(_this.Model.OtherAttendees, 1)));
            _this.Write(" knows;\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_edb00ca9_0c54_4d39_9361_b8d560e2448f(dynamic _this)
        {
            _this.Push();
#line 71 "MeetingBallot.txm"
            _this.Write("the others know");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_cce5eb33_35a7_434c_a6e6_d6bf802508f0(dynamic _this)
        {
            _this.Push();
#line 67 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.OtherAttendees, "length") == 1)
                _this.Write(Hook_271b2a2a_77ca_4358_b996_43fc82766d2b(_this));
            else
                _this.Write(Hook_edb00ca9_0c54_4d39_9361_b8d560e2448f(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_98fd8375_ab9c_4030_82a7_ea9a4cfcd6ca(dynamic _this)
        {
            _this.Push();
#line 73 "MeetingBallot.txm"
            _this.Write(CasualDisplayName(Index(_this.Model.Location, "Originator")));
            _this.Write(" knows");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_73fe8e07_c705_41f1_9e1f_e61d7f8c1465(dynamic _this)
        {
            _this.Push();
#line 74 "MeetingBallot.txm"
            _this.Write(CasualDisplayName(_this.Model.Creator));
            _this.Write(" knows");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_d1880799_21f3_4e4a_a3fb_07b6a200a148(dynamic _this)
        {
            _this.Push();
#line 65 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 66 "MeetingBallot.txm"
                _this.Write("Kindly ");
                if (_this.Model.NeedsTimeInfo)
                    _this.Write(Hook_b50f84b2_1cc6_4be8_a77b_a7e84e2f006e(_this));
                _this.Write(" ");
                if (_this.WriteOpenTag("strong", false, null))
                {
#line 66 "MeetingBallot.txm"
                    _this.Write("provide your preferred ");
                    _this.Write(Hook_561bb371_dde2_4cc1_98f7_52a2bf7c568e(_this));
                    _this.Write(" ");
                    _this.WriteCloseTag("strong");
                }

                _this.Write(", so that\r\n");
                if (_this.Model.IsCreator)
                    _this.Write(Hook_cce5eb33_35a7_434c_a6e6_d6bf802508f0(_this));
                else if (Index((Index(_this.Model.Location, "Originator")), "length") == 0)
                    _this.Write(Hook_98fd8375_ab9c_4030_82a7_ea9a4cfcd6ca(_this));
                else
                    _this.Write(Hook_73fe8e07_c705_41f1_9e1f_e61d7f8c1465(_this));
                _this.Write("\r\nhow to reach you.\r\n");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_b3d1cf63_db34_4e5f_9ab0_89880872270c(dynamic _this)
        {
            _this.Push();
#line 64 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.NeedsContactInfo)
                _this.Write(Hook_d1880799_21f3_4e4a_a3fb_07b6a200a148(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public override TxMark.Template.IValue View(dynamic _this)
        {
            _this.Push();
#line 1 "MeetingBallot.txm"
            if (_this.WriteOpenTag("p", false, null))
            {
#line 1 "MeetingBallot.txm"
                _this.Write("\r\n");
                _this.WriteCloseTag("p");
            }

            if (_this.WriteOpenTag("p", false, null))
            {
#line 20 "MeetingBallot.txm"
                _this.Write("\r\n\r\n");
                _this.WriteCloseTag("p");
            }

            if (_this.WriteOpenTag("p", false, null))
            {
#line 32 "MeetingBallot.txm"
                _this.Write("\r\n\r\n");
                _this.WriteCloseTag("p");
            }

            if (_this.WriteOpenTag("p", false, null))
            {
#line 44 "MeetingBallot.txm"
                _this.Write("\r\n\r\n");
                _this.WriteCloseTag("p");
            }

            if (_this.WriteOpenTag("p", false, null))
            {
#line 52 "MeetingBallot.txm"
                _this.Write("\r\n\r\n");
                _this.WriteCloseTag("p");
            }

            if (_this.WriteOpenTag("p", false, null))
            {
#line 59 "MeetingBallot.txm"
                _this.Write("\r\n\r\n");
                _this.WriteCloseTag("p");
            }

            if (_this.WriteOpenTag("p", false, null))
            {
#line 63 "MeetingBallot.txm"
                _this.Write("\r\n\r\n");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 80 "MeetingBallot.txm"
                _this.Write("\r\n");
                _this.WriteCloseTag("p");
            }

            return _this.Pop();
        }
    }
}