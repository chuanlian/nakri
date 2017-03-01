webpackJsonp([2],{

/***/ 399:
/***/ function(module, exports, __webpack_require__) {

	'use strict';
	
	var _VueModel = __webpack_require__(5);
	
	var _VueModel2 = _interopRequireDefault(_VueModel);
	
	var _index = __webpack_require__(400);
	
	var _index2 = _interopRequireDefault(_index);
	
	var _indexTpl = __webpack_require__(402);
	
	var _indexTpl2 = _interopRequireDefault(_indexTpl);
	
	function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }
	
	module.exports = _VueModel2.default.getComponent({
	    ready: function ready() {
	        this.init();
	    },
	
	    template: _indexTpl2.default,
	    data: function data() {
	        return {
	            msg: 'it is a guy...'
	        };
	    },
	
	    components: {},
	    events: {},
	    methods: {
	        init: function init() {
	            return 123;
	        }
	    }
	});

/***/ },

/***/ 400:
/***/ function(module, exports, __webpack_require__) {

	// style-loader: Adds some css to the DOM by adding a <style> tag
	
	// load the styles
	var content = __webpack_require__(401);
	if(typeof content === 'string') content = [[module.id, content, '']];
	// add the styles to the DOM
	var update = __webpack_require__(14)(content, {});
	if(content.locals) module.exports = content.locals;
	// Hot Module Replacement
	if(false) {
		// When the styles change, update the <style> tags
		if(!content.locals) {
			module.hot.accept("!!./../../../node_modules/css-loader/index.js!./../../../node_modules/stylus-loader/index.js!./index.styl", function() {
				var newContent = require("!!./../../../node_modules/css-loader/index.js!./../../../node_modules/stylus-loader/index.js!./index.styl");
				if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
				update(newContent);
			});
		}
		// When the module is disposed, remove the <style> tags
		module.hot.dispose(function() { update(); });
	}

/***/ },

/***/ 401:
/***/ function(module, exports, __webpack_require__) {

	exports = module.exports = __webpack_require__(13)();
	// imports
	
	
	// module
	exports.push([module.id, ".data-table {\n  position: relative;\n  box-sizing: border-box;\n  padding: 15px;\n}\n.table-header {\n  background-color: #307ecc;\n  line-height: 36px;\n  padding-left: 12px;\n  font-size: 14px;\n  color: #fff;\n}\n.table-borderred {\n  border: 1px solid #ddd;\n}\n.table-body {\n  display: table;\n  width: 100%;\n  border-collapse: collapse;\n  border-top: 1px solid #ddd;\n  border-bottom: 1px solid #ddd;\n}\n.table-body thead {\n  display: table-header-group;\n  vertical-align: middle;\n}\n.table-body thead tr {\n  display: table-row;\n  color: #707070;\n  font-weight: normal;\n  background: #f2f2f2;\n  background-image: linear-gradient(to bottom, #f8f8f8 0, #ececec 100%);\n  background-repeat: repeat-x;\n}\n.table-body thead th {\n  padding: 8px;\n  line-height: 1.5;\n  border: 1px solid #ddd;\n  border-bottom-width: 2px;\n  font-weight: bold;\n}\n.table-body tbody {\n  display: table-header-group;\n  vertical-align: middle;\n}\n.table-body tbody tr {\n  display: table-row;\n}\n.table-body tbody tr:nth-child(odd) td {\n  padding: 8px;\n  line-height: 1.5;\n  background-color: #f9f9f9;\n  border: 1px solid #ddd;\n}\n.table-body tbody tr:nth-child(even) td {\n  padding: 8px;\n  line-height: 1.5;\n  border: 1px solid #ddd;\n}\n.table-body tbody tr:hover td {\n  background-color: #f5f5f5;\n}\n.pager {\n  padding-top: 12px;\n  padding-bottom: 12px;\n  height: 24px;\n  line-height: 1.5;\n  background-color: #eff3f8;\n  border-top: 1px solid #ddd;\n  border-bottom: 1px solid #ddd;\n}\n.pager-left {\n  float: left;\n  font-size: 14px;\n}\n.pager-right {\n  float: right;\n}\n.pager-info {\n  padding-left: 10px;\n}\n.pager-info select {\n  width: 70px;\n  height: 24px;\n  padding: 2px 3px;\n  margin: 0 4px;\n  background-color: #fff;\n  border: 1px solid #d5d5d5;\n  color: #858585;\n}\n.pagination {\n  display: inline-block;\n  margin: 0 12px;\n}\n.pagination li {\n  display: inline;\n}\n.pagination li a {\n  position: relative;\n  float: left;\n  padding: 6px 12px;\n  line-height: 1.5;\n  text-decoration: none;\n  color: #2283c5;\n  background-color: #f2f2f2;\n  background-color: #fff;\n  border: 1px solid #ddd;\n}\n.pagination li.active a {\n  background-color: #6faed9;\n  border-color: #6faed9;\n  color: #fff;\n  text-shadow: 0 -1px 0 rgba(0,0,0,0.25);\n  cursor: default;\n}\n.pagination li.disabled a {\n  background-color: #f9f9f9;\n  border-color: #d9d9d9;\n  color: #999;\n  cursor: default;\n}\n", ""]);
	
	// exports


/***/ },

/***/ 402:
/***/ function(module, exports) {

	module.exports = "<div class=\"data-table\">\r\n    <div class=\"table-header\">\r\n        <span>这是表格title</span>\r\n    </div>\r\n    <div class=\"table-response\">\r\n        <table class=\"table-body table-borderred\">\r\n            <thead>\r\n                <tr role=\"row\">\r\n                    <th tabindex=\"0\">ID</th>\r\n                    <th tabindex=\"1\">Name</th>\r\n                    <th tabindex=\"2\">Age</th>\r\n                </tr>\r\n            </thead>\r\n            <tbody>\r\n                <tr class=\"odd\">\r\n                    <td>1</td>\r\n                    <td>abc</td>\r\n                    <td>21</td>\r\n                </tr>\r\n                <tr class=\"even\">\r\n                    <td>2</td>\r\n                    <td>def</td>\r\n                    <td>12</td>\r\n                </tr>\r\n                <tr class=\"odd\">\r\n                    <td>3</td>\r\n                    <td>abc</td>\r\n                    <td>21</td>\r\n                </tr>\r\n                <tr class=\"even\">\r\n                    <td>4</td>\r\n                    <td>def</td>\r\n                    <td>12</td>\r\n                </tr>\r\n            </tbody>\r\n        </table>\r\n        <div class=\"pager\">\r\n            <div class=\"pager-left\">\r\n                <span class=\"pager-info\">Display <select size=\"1\">\r\n                    <option value=\"10\">10</option>\r\n                    <option value=\"20\">20</option>\r\n                    <option value=\"50\">50</option>\r\n                </select> records</span>\r\n            </div>\r\n            <div class=\"pager-right\">\r\n                <div class=\"pagenate\">\r\n                    <ul class=\"pagination\">\r\n                        <li class=\"prev disabled\">\r\n                            <a href=\"javascript:;\">\r\n                                <i class=\"fa fa-angle-double-left\"></i>\r\n                            </a>\r\n                        </li>\r\n                        <li class=\"active\"><a href=\"javascript:;\">1</a></li>\r\n                        <li><a href=\"javascript:;\">2</a></li>\r\n                        <li><a href=\"javascript:;\">3</a></li>\r\n                        <li class=\"next\">\r\n                            <a href=\"javascript:;\">\r\n                                <i class=\"fa fa-angle-double-right\"></i>\r\n                            </a>\r\n                        </li>\r\n                    </ul>\r\n                </div>\r\n            </div>\r\n        </div>\r\n    </div>\r\n</div>";

/***/ }

});
//# sourceMappingURL=2.2.js.map