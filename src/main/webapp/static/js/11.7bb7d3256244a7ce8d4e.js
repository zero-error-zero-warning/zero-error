webpackJsonp([11],{mYKZ:function(e,r){},ofzq:function(e,r,t){"use strict";Object.defineProperty(r,"__esModule",{value:!0});var l=t("9FZZ"),o={data:function(){return{ruleForm:{name:"",gender:"",phoneNum:""},rules:{name:[{required:!0,message:"请输入用户名",trigger:"blur"}],gender:[{required:!0,message:"请选择性别",trigger:"change"}],phoneNum:[{required:!0,validator:function(e,r,t){if(!r)return t(new Error("手机号不能为空"));setTimeout(function(){/^0?1[3|4|5|6|7|8][0-9]\d{8}$/.test(r)?t():t(new Error("请输入正确的手机号码！"))},1e3)},trigger:"blur"}]}}},methods:{submitForm:function(e){var r=this;this.$refs[e].validate(function(t){if(!t)return!1;Object(l.a)(r.ruleForm).then(function(t){0==t.data.status&&alert("已存在该号码！"),1==t.data.status&&(alert("注册成功！"),r.$refs[e].resetFields())})})},resetForm:function(e){this.$refs[e].resetFields()}}},n={render:function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",{staticClass:"pos"},[t("el-form",{ref:"ruleForm",staticClass:"demo-ruleForm",attrs:{model:e.ruleForm,rules:e.rules,"label-width":"100px"}},[t("el-form-item",{attrs:{label:"姓名",prop:"name"}},[t("el-col",{attrs:{span:24}},[t("el-input",{attrs:{placeholder:"不能为空"},model:{value:e.ruleForm.name,callback:function(r){e.$set(e.ruleForm,"name",r)},expression:"ruleForm.name"}})],1)],1),e._v(" "),t("el-form-item",{attrs:{label:"性别",prop:"gender"}},[t("el-radio",{attrs:{label:"男"},model:{value:e.ruleForm.gender,callback:function(r){e.$set(e.ruleForm,"gender",r)},expression:"ruleForm.gender"}},[e._v("男")]),e._v(" "),t("el-radio",{attrs:{label:"女"},model:{value:e.ruleForm.gender,callback:function(r){e.$set(e.ruleForm,"gender",r)},expression:"ruleForm.gender"}},[e._v("女")])],1),e._v(" "),t("el-form-item",{attrs:{label:"手机号码",prop:"phoneNum"}},[t("el-col",{attrs:{span:24}},[t("el-input",{attrs:{placeholder:"长度为11位，满足号码规则"},model:{value:e.ruleForm.phoneNum,callback:function(r){e.$set(e.ruleForm,"phoneNum",r)},expression:"ruleForm.phoneNum"}})],1)],1),e._v(" "),t("el-form-item",[t("el-button",{attrs:{type:"primary",round:""},on:{click:function(r){return e.submitForm("ruleForm")}}},[e._v("立即注册")]),e._v(" "),t("el-button",{attrs:{type:"primary",round:""},on:{click:function(r){return e.resetForm("ruleForm")}}},[e._v(" 重置 ")])],1)],1)],1)},staticRenderFns:[]};var a=t("VU/8")(o,n,!1,function(e){t("mYKZ")},"data-v-18b63591",null);r.default=a.exports}});
//# sourceMappingURL=11.7bb7d3256244a7ce8d4e.js.map