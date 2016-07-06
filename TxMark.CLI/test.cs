/*
 *  TxMark 1.0.0.alpha-0-g0639c8a
 *
 *  Copyright (c) 2016 Aaron G. Daisley-Harrison
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
namespace TxMark.Templates
{
    public class MeetingBallot : TxMark.Utilities.CHCompiledTemplateBase<dynamic>
    {
        public MeetingBallot()
        {
        }

        public TxMark.Template.IValue Hook_415e24c1_5bb7_4645_a47e_5c74f4c93bae(dynamic _this)
        {
            _this.Push();
#line 3 "MeetingBallot.txm"
            _this.Write("for you both.");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_b61d293e_1c51_4961_8003_dc24e121a456(dynamic _this)
        {
            _this.Push();
#line 2 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator != true)
                _this.Write(Hook_415e24c1_5bb7_4645_a47e_5c74f4c93bae(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_f2024ab5_410d_4208_b1d2_7f3cd233e504(dynamic _this)
        {
            _this.Push();
#line 6 "MeetingBallot.txm"
            _this.Write("with");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_4e4ad5fc_3cef_4abf_8dd1_a32d81f815b7(dynamic _this)
        {
            _this.Push();
#line 7 "MeetingBallot.txm"
            _this.Write("with you and");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_380d492c_cf89_4ad6_8b6e_290818c5aa17(dynamic _this)
        {
            _this.Push();
#line 5 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_f2024ab5_410d_4208_b1d2_7f3cd233e504(_this));
            else
                _this.Write(Hook_4e4ad5fc_3cef_4abf_8dd1_a32d81f815b7(_this));
            _this.Write("\r\n");
            _this.Write(CasualDisplayName(Index("otherAttendees", 1)));
            _this.Write(".\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_12604868_7f3e_40ec_b7e5_1e5e9f9c4f1e(dynamic _this)
        {
            _this.Push();
#line 11 "MeetingBallot.txm"
            _this.Write("with");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_6ad5b414_aa7e_495d_baa1_a861c4a7e2f8(dynamic _this)
        {
            _this.Push();
#line 12 "MeetingBallot.txm"
            _this.Write("with you ");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_5e754fce_7c80_439e_a866_3fcc858968ef(dynamic _this)
        {
            _this.Push();
#line 10 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_12604868_7f3e_40ec_b7e5_1e5e9f9c4f1e(_this));
            else
                _this.Write(Hook_6ad5b414_aa7e_495d_baa1_a861c4a7e2f8(_this));
            _this.Write("\r\n");
            _this.Write(CasualDisplayName(Index("otherAttendees", 1)));
            _this.Write(", and ");
            _this.Write(CasualDisplayName(Index("otherAttendees", 2)));
            _this.Write(".\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_4a65b27a_fbc4_43fb_a8ae_96b4727cf100(dynamic _this)
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

        public TxMark.Template.IValue Hook_c9f94c39_2237_47e8_ae2e_756334905f1a(dynamic _this)
        {
            _this.Push();
#line 17 "MeetingBallot.txm"
            _this.Write("with you, ");
            _this.Write(CasualDisplayName(Index("otherAttendees", 1)));
            _this.Write(", and others.");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_265e879c_6188_4eae_a8c1_a131a2416f06(dynamic _this)
        {
            _this.Push();
#line 15 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_4a65b27a_fbc4_43fb_a8ae_96b4727cf100(_this));
            else
                _this.Write(Hook_c9f94c39_2237_47e8_ae2e_756334905f1a(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_b8178a63_0e0e_4359_aae5_a2234bff55f4(dynamic _this)
        {
            _this.Push();
#line 1 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.otherAttendees == null || Index("otherAttendees", "length") == 0)
                _this.Write(Hook_b61d293e_1c51_4961_8003_dc24e121a456(_this));
            else if (Index(_this.Model.otherAttendees, "length") == 1)
                _this.Write(Hook_380d492c_cf89_4ad6_8b6e_290818c5aa17(_this));
            else if (Index(_this.Model.otherAttendees, "length") == 2)
                _this.Write(Hook_5e754fce_7c80_439e_a866_3fcc858968ef(_this));
            else
                _this.Write(Hook_265e879c_6188_4eae_a8c1_a131a2416f06(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_8e1693cd_bf6a_46cb_bb6b_e0396c77acad(dynamic _this)
        {
            _this.Push();
#line 23 "MeetingBallot.txm"
            _this.Write("your calendar");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_02f142f6_2f6c_4d52_98e6_89d146f02304(dynamic _this)
        {
            _this.Push();
#line 24 "MeetingBallot.txm"
            _this.Write("both of your calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_df2e5ca0_ef24_4cc1_877c_113bdc475e5a(dynamic _this)
        {
            _this.Push();
#line 22 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_8e1693cd_bf6a_46cb_bb6b_e0396c77acad(_this));
            else
                _this.Write(Hook_02f142f6_2f6c_4d52_98e6_89d146f02304(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_c8f9e322_7ba5_4f17_8328_dbd3586f2c7f(dynamic _this)
        {
            _this.Push();
#line 27 "MeetingBallot.txm"
            _this.Write("both of your calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_bc7cc7c0_7785_4ce8_8bb4_3fd8ff97a8a4(dynamic _this)
        {
            _this.Push();
#line 28 "MeetingBallot.txm"
            _this.Write("all of calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_82450d47_90b2_4f39_b92f_120d633bdd11(dynamic _this)
        {
            _this.Push();
#line 26 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.IsCreator)
                _this.Write(Hook_c8f9e322_7ba5_4f17_8328_dbd3586f2c7f(_this));
            else
                _this.Write(Hook_bc7cc7c0_7785_4ce8_8bb4_3fd8ff97a8a4(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_90f64434_feaa_4fb6_8edc_32d1702153b9(dynamic _this)
        {
            _this.Push();
#line 30 "MeetingBallot.txm"
            _this.Write("all of your calendars");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_d7c2c2d3_5fd4_4956_8188_1efe6afb202c(dynamic _this)
        {
            _this.Push();
#line 21 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.otherAttendees == null || Index(_this.Model.otherAttendees, "length") == 0)
                _this.Write(Hook_df2e5ca0_ef24_4cc1_877c_113bdc475e5a(_this));
            else if (Index(_this.Model.otherAttendees, "length") == 1)
                _this.Write(Hook_82450d47_90b2_4f39_b92f_120d633bdd11(_this));
            else
                _this.Write(Hook_90f64434_feaa_4fb6_8edc_32d1702153b9(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_bc9f1bbd_9c9e_41ff_a700_66939a171d40(dynamic _this)
        {
            _this.Push();
#line 34 "MeetingBallot.txm"
            _this.Write(" and ");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_dc3cd537_99a3_4b2a_97a1_bf6c963c8c69(dynamic _this)
        {
            _this.Push();
#line 34 "MeetingBallot.txm"
            _this.Write("meeting ");
            if (Index(_this.Model.location, "RemoteLocationType") == "None")
                _this.Write(Hook_bc9f1bbd_9c9e_41ff_a700_66939a171d40(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_7abe405e_3f8f_4ff9_b164_86e2d6e90b9b(dynamic _this)
        {
            _this.Push();
#line 37 "MeetingBallot.txm"
            _this.Write("phone call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_c3b4c6a8_731f_4702_b556_5c5ebb978689(dynamic _this)
        {
            _this.Push();
#line 38 "MeetingBallot.txm"
            _this.Write("Skype call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_578022c0_de83_4a18_9370_ee133c3fef59(dynamic _this)
        {
            _this.Push();
#line 39 "MeetingBallot.txm"
            _this.Write("Google Hangout");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_f033619e_9ddb_4963_86c2_19fa708fb69f(dynamic _this)
        {
            _this.Push();
#line 40 "MeetingBallot.txm"
            _this.Write("conference call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_48dd25c6_3ffd_41ab_8596_cfddcb8f0d08(dynamic _this)
        {
            _this.Push();
#line 41 "MeetingBallot.txm"
            _this.Write("online meeting");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_ab7c682e_c0f1_4b34_a394_5c6a046e5a0d(dynamic _this)
        {
            _this.Push();
#line 42 "MeetingBallot.txm"
            _this.Write("meeting");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_a71e392d_7f09_4862_af27_2d9c6e8bb5c5(dynamic _this)
        {
            _this.Push();
#line 42 "MeetingBallot.txm"
            if (Index(_this.Model.Location, "IsInPerson") != true)
                _this.Write(Hook_ab7c682e_c0f1_4b34_a394_5c6a046e5a0d(_this));
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_590ab006_1cd0_4a6e_90aa_3ab23df07611(dynamic _this)
        {
            _this.Push();
#line 33 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.location, "IsInPerson"))
                _this.Write(Hook_dc3cd537_99a3_4b2a_97a1_bf6c963c8c69(_this));
            _this.Write("\r\n");
            if ("Other" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_48dd25c6_3ffd_41ab_8596_cfddcb8f0d08(_this));
            else if ("ConferenceCall" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_f033619e_9ddb_4963_86c2_19fa708fb69f(_this));
            else if ("Hangout" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_578022c0_de83_4a18_9370_ee133c3fef59(_this));
            else if ("Skype" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_c3b4c6a8_731f_4702_b556_5c5ebb978689(_this));
            else if ("Phone" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_7abe405e_3f8f_4ff9_b164_86e2d6e90b9b(_this));
            else
                _this.Write(Hook_a71e392d_7f09_4862_af27_2d9c6e8bb5c5(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_cf306077_ecc4_4d42_9b9a_b1553de82076(dynamic _this)
        {
            _this.Push();
#line 47 "MeetingBallot.txm"
            _this.Write("phone");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_1ff0ad48_0d3e_45ce_bd18_d99f6f9ab0c4(dynamic _this)
        {
            _this.Push();
#line 48 "MeetingBallot.txm"
            _this.Write("Skype");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_3bc7e96d_394e_47bd_82d2_257f75f1db98(dynamic _this)
        {
            _this.Push();
#line 49 "MeetingBallot.txm"
            _this.Write("Google Hangout");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_c005ce5c_acfe_463d_92de_dbeb32d19aff(dynamic _this)
        {
            _this.Push();
#line 50 "MeetingBallot.txm"
            _this.Write("conference call");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_99e743f2_17c3_4a76_9f34_941199b52e51(dynamic _this)
        {
            _this.Push();
#line 45 "MeetingBallot.txm"
            _this.Write("\r\n");
            if ("ConferenceCall" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_c005ce5c_acfe_463d_92de_dbeb32d19aff(_this));
            else if ("Hangout" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_3bc7e96d_394e_47bd_82d2_257f75f1db98(_this));
            else if ("Skype" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_1ff0ad48_0d3e_45ce_bd18_d99f6f9ab0c4(_this));
            else if ("Phone" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_cf306077_ecc4_4d42_9b9a_b1553de82076(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_ef7e87c0_c544_4c51_a55c_ad08ebe5faad(dynamic _this)
        {
            _this.Push();
#line 55 "MeetingBallot.txm"
            _this.Write("phone number");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_31e3dce9_6dae_4eaf_879f_9c54a238b24c(dynamic _this)
        {
            _this.Push();
#line 56 "MeetingBallot.txm"
            _this.Write("Skype address");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_24a27953_05b6_43a3_a072_77326647bc64(dynamic _this)
        {
            _this.Push();
#line 57 "MeetingBallot.txm"
            _this.Write("gmail address");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_8394ae7e_8e8a_44af_ab1e_3572bb2b16d2(dynamic _this)
        {
            _this.Push();
#line 53 "MeetingBallot.txm"
            _this.Write("\r\n");
            if ("Hangout" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_24a27953_05b6_43a3_a072_77326647bc64(_this));
            else if ("Skype" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_31e3dce9_6dae_4eaf_879f_9c54a238b24c(_this));
            else if ("Phone" == Index(_this.Model.Location, "RemoteLocationType"))
                _this.Write(Hook_ef7e87c0_c544_4c51_a55c_ad08ebe5faad(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_ae7ec41f_d71d_45b3_82b1_8031a798aee2(dynamic _this)
        {
            _this.Push();
#line 61 "MeetingBallot.txm"
            _this.Write("The meeting will be held at ");
            _this.Write(Print(Index(_this.Model.Location, "MeetingLocation")));
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_c4fd3c67_8d84_4059_9e8f_909885d2ce8b(dynamic _this)
        {
            _this.Push();
#line 60 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.Location, "IsInPerson") && Index((Index(_this.Model.Location, "MeetingLocation")), "length") == 0)
                _this.Write(Hook_ae7ec41f_d71d_45b3_82b1_8031a798aee2(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_25b9ee70_e1b0_487b_8617_62ac199a875a(dynamic _this)
        {
            _this.Push();
#line 66 "MeetingBallot.txm"
            _this.Write("also");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_a6c3bee3_3a5b_4e3d_9b94_cb095df3010d(dynamic _this)
        {
            _this.Push();
#line 68 "MeetingBallot.txm"
            _this.Write("\r\n");
            _this.Write(CasualDisplayName(Index(_this.Model.OtherAttendees, 1)));
            _this.Write(" knows;\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_cef62761_32a5_4368_a676_c1d534971b32(dynamic _this)
        {
            _this.Push();
#line 71 "MeetingBallot.txm"
            _this.Write("the others know");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_366c4d61_349e_46dd_8616_44711d84a562(dynamic _this)
        {
            _this.Push();
#line 67 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (Index(_this.Model.OtherAttendees, "length") == 1)
                _this.Write(Hook_a6c3bee3_3a5b_4e3d_9b94_cb095df3010d(_this));
            else
                _this.Write(Hook_cef62761_32a5_4368_a676_c1d534971b32(_this));
            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_3bb46fa9_8f31_40bc_8788_1de8b51ae376(dynamic _this)
        {
            _this.Push();
#line 73 "MeetingBallot.txm"
            _this.Write(CasualDisplayName(Index(_this.Model.Location, "Originator")));
            _this.Write(" knows");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_ede43206_39ce_49cb_86d7_4508bebd75d9(dynamic _this)
        {
            _this.Push();
#line 74 "MeetingBallot.txm"
            _this.Write(CasualDisplayName(_this.Model.Creator));
            _this.Write(" knows");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_2bfdc9c9_0e43_47f1_8dd8_f64df0b5c271(dynamic _this)
        {
            _this.Push();
#line 65 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.WriteOpenTag("p", false, null))
            {
#line 66 "MeetingBallot.txm"
                _this.Write("Kindly ");
                if (_this.Model.NeedsTimeInfo)
                    _this.Write(Hook_25b9ee70_e1b0_487b_8617_62ac199a875a(_this));
                _this.Write(" ");
                if (_this.WriteOpenTag("strong", false, null))
                {
#line 66 "MeetingBallot.txm"
                    _this.Write("provide your preferred ");
                    _this.Write(Hook_8394ae7e_8e8a_44af_ab1e_3572bb2b16d2(_this));
                    _this.Write(" ");
                    _this.WriteCloseTag("strong");
                }

                _this.Write(", so that\r\n");
                if (_this.Model.IsCreator)
                    _this.Write(Hook_366c4d61_349e_46dd_8616_44711d84a562(_this));
                else if (Index((Index(_this.Model.Location, "Originator")), "length") == 0)
                    _this.Write(Hook_3bb46fa9_8f31_40bc_8788_1de8b51ae376(_this));
                else
                    _this.Write(Hook_ede43206_39ce_49cb_86d7_4508bebd75d9(_this));
                _this.Write("\r\nhow to reach you.\r\n");
                _this.WriteCloseTag("p");
            }

            _this.Write("\r\n");
            return _this.Pop();
        }

        public TxMark.Template.IValue Hook_f26717e2_cf71_4010_9237_a41845644811(dynamic _this)
        {
            _this.Push();
#line 64 "MeetingBallot.txm"
            _this.Write("\r\n");
            if (_this.Model.NeedsContactInfo)
                _this.Write(Hook_2bfdc9c9_0e43_47f1_8dd8_f64df0b5c271(_this));
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