webpackJsonp([7],{Oltc:function(e,r){},QvZt:function(e,r,t){"use strict";Object.defineProperty(r,"__esModule",{value:!0});var o=t("mvHQ"),a=t.n(o),s=t("vMJZ"),n={data:function(){var e=this;return{ruleForm2:{username:"",password:""},rules:{username:[{required:!0,validator:function(e,r,t){if(!r)return t(new Error("手机号不能为空"));setTimeout(function(){/^0?1[3|4|5|6|7|8][0-9]\d{8}$/.test(r)?t():t(new Error("请输入正确的手机号码！"))},1e3)},trigger:"blur"}],password:[{required:!0,validator:function(r,t,o){""===t?o(new Error("请输入密码")):(e.ruleForm2.password,o())},trigger:"blur"}]}}},methods:{submitForm2:function(e){var r=this;this.$refs[e].validate(function(e){if(!e)return!1;var t=r;Object(s.a)(r.ruleForm2).then(function(e){if(1==e.data.status){alert(e.data.adminName),localStorage.setItem("admininfo",a()(e.data));var r=JSON.parse(localStorage.getItem("admininfo"));t.$store.commit("GET_ADMININFO",r),t.$router.push("/home/store")}})})},testVuex:function(){console.log("进入testVuex测试方法......")}}},l={render:function(){var e=this,r=e.$createElement,t=e._self._c||r;return t("div",[t("div",{staticClass:"pos"},[t("el-form",{ref:"ruleForm2",staticClass:"demo-ruleForm",attrs:{model:e.ruleForm2,rules:e.rules,"label-width":"100px"}},[t("h2",[e._v("zero-error后台管理")]),e._v(" "),t("el-form-item",{attrs:{label:"账号",prop:"username"}},[t("el-col",{attrs:{span:24}},[t("el-input",{model:{value:e.ruleForm2.username,callback:function(r){e.$set(e.ruleForm2,"username",r)},expression:"ruleForm2.username"}})],1)],1),e._v(" "),t("el-form-item",{attrs:{label:"密码",prop:"password"}},[t("el-col",{attrs:{span:24}},[t("el-input",{attrs:{type:"password",autocomplete:"off","show-password":""},model:{value:e.ruleForm2.password,callback:function(r){e.$set(e.ruleForm2,"password",r)},expression:"ruleForm2.password"}})],1)],1),e._v(" "),t("el-form-item",[t("el-button",{attrs:{type:"primary",round:""},on:{click:function(r){e.submitForm2("ruleForm2"),e.testVuex()}}},[e._v("登录")])],1)],1)],1),e._v(" "),t("router-link",{attrs:{to:"/login"}},[e._v("前往员工登录")])],1)},staticRenderFns:[]};var u=t("VU/8")(n,l,!1,function(e){t("Oltc")},"data-v-c8d76c92",null);r.default=u.exports},vMJZ:function(e,r,t){"use strict";r.b=function(e){return axios.post("http://localhost:8080/employee/employeeLogin",e)},r.a=function(e){return axios.post("http://localhost:8080/admin/adminLogin",e)};t("Kkag")}});
//# sourceMappingURL=7.cd208b63cfd5dad5ba82.js.map