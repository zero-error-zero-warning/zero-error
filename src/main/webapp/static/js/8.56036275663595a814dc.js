webpackJsonp([8],{r8dz:function(e,n){},wUZA:function(e,n,t){"use strict";Object.defineProperty(n,"__esModule",{value:!0});var o={data:function(){return{top:"welcome",isAdmin:this.$store.state.isAdmin}},components:{Aside:function(){return t.e(19).then(t.bind(null,"3x7d"))},Top:function(){return t.e(18).then(t.bind(null,"yH9B"))}},methods:{handleCommand:function(e){"a"==e?this.$router.push("/home/user"):(localStorage.clear(),this.$router.push("/"))}}},s={render:function(){var e=this,n=e.$createElement,t=e._self._c||n;return t("el-container",[t("el-header",[t("div",{staticClass:"name"},[e._v(e._s(e.top))]),e._v(" "),t("div",{staticClass:"top"},[t("Top")],1),e._v(" "),t("el-dropdown",{on:{command:e.handleCommand}},[e.isAdmin?t("span",{staticClass:"el-dropdown-link"},[e._v("\r\n                 欢迎你,"+e._s(e.$store.state.admininfo.adminName)+" "),t("i",{staticClass:"el-icon-view"})]):t("span",{staticClass:"el-dropdown-link"},[e._v("\r\n                 欢迎你,"+e._s(e.$store.state.userinfo.employeeName)+" "),t("i",{staticClass:"el-icon-view"})]),e._v(" "),t("el-dropdown-menu",{attrs:{slot:"dropdown"},slot:"dropdown"},[t("el-dropdown-item",{attrs:{command:"a"}},[e._v("个人信息")]),e._v(" "),t("el-dropdown-item",{attrs:{command:"b"}},[e._v("注销")])],1)],1)],1),e._v(" "),t("el-container",[t("el-aside",{attrs:{width:"200px"}},[t("Aside")],1),e._v(" "),t("el-main",[t("router-view")],1)],1)],1)},staticRenderFns:[]};var a=t("VU/8")(o,s,!1,function(e){t("r8dz")},null,null);n.default=a.exports}});
//# sourceMappingURL=8.56036275663595a814dc.js.map