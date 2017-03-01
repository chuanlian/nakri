webpackJsonp([3],{

/***/ 403:
/***/ function(module, exports, __webpack_require__) {

	/* WEBPACK VAR INJECTION */(function($) {'use strict';
	
	var _VueModel = __webpack_require__(5);
	
	var _VueModel2 = _interopRequireDefault(_VueModel);
	
	var _index = __webpack_require__(404);
	
	var _index2 = _interopRequireDefault(_index);
	
	var _indexTpl = __webpack_require__(406);
	
	var _indexTpl2 = _interopRequireDefault(_indexTpl);
	
	var _utils = __webpack_require__(407);
	
	var _utils2 = _interopRequireDefault(_utils);
	
	function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }
	
	module.exports = _VueModel2.default.getComponent({
	    ready: function ready() {
	        this.init();
	    },
	
	    template: _indexTpl2.default,
	    data: function data() {
	        return {
	            tradeId: '-1',
	            tradeGraphDowns: [],
	            tradeGraphUps: [],
	            downTrades: [],
	            upTrades: []
	        };
	    },
	
	    components: {},
	    events: {},
	    methods: {
	        init: function init() {},
	        saveForm: function saveForm() {
	            var formData = {
	                tradeId: this.tradeId,
	                custId: '1111',
	                tradeGraphDowns: this.downTrades,
	                tradeGraphUps: this.upTrades
	            };
	            $.request('/Nakri/trade/saveCustTrade', {
	                type: 'POST',
	                data: formData
	            }).then(function (res) {
	                if (res.status === 0) {
	                    _utils2.default.alert('保存成功', function () {
	                        window.router.go('/industry');
	                    });
	                }
	            }, function (res) {
	                _utils2.default.alert('系统网络故障，请稍候重试');
	            });
	        },
	        getIndustry: function getIndustry() {
	            var me = this;
	            if (this.tradeId === '-1') {
	                return false;
	            }
	            var param = {
	                tradeId: this.tradeId
	            };
	            $.request('/Nakri/trade/showTradeUpAndDown', {
	                type: 'GET',
	                data: param
	            }).then(function (res) {
	                me.tradeGraphUps = res.data.tradeGraphUps || [];
	                me.tradeGraphDowns = res.data.tradeGraphDowns || [];
	            }, function (res) {
	                return [];
	            });
	        }
	    }
	});
	/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(2)))

/***/ },

/***/ 404:
/***/ function(module, exports, __webpack_require__) {

	// style-loader: Adds some css to the DOM by adding a <style> tag
	
	// load the styles
	var content = __webpack_require__(405);
	if(typeof content === 'string') content = [[module.id, content, '']];
	// add the styles to the DOM
	var update = __webpack_require__(14)(content, {});
	if(content.locals) module.exports = content.locals;
	// Hot Module Replacement
	if(false) {
		// When the styles change, update the <style> tags
		if(!content.locals) {
			module.hot.accept("!!./../../../../node_modules/css-loader/index.js!./../../../../node_modules/stylus-loader/index.js!./index.styl", function() {
				var newContent = require("!!./../../../../node_modules/css-loader/index.js!./../../../../node_modules/stylus-loader/index.js!./index.styl");
				if(typeof newContent === 'string') newContent = [[module.id, newContent, '']];
				update(newContent);
			});
		}
		// When the module is disposed, remove the <style> tags
		module.hot.dispose(function() { update(); });
	}

/***/ },

/***/ 405:
/***/ function(module, exports, __webpack_require__) {

	exports = module.exports = __webpack_require__(13)();
	// imports
	
	
	// module
	exports.push([module.id, ".data-form {\n  width: 100%;\n  font-size: 12px;\n}\n.form-header {\n  height: 48px;\n  line-height: 48px;\n  padding-left: 20px;\n}\n.form-header strong {\n  font-size: 16px;\n  font-weight: bold;\n}\n.form-body {\n  position: relative;\n  padding: 0 20px;\n}\n.form-btn {\n  display: block;\n  width: 120px;\n  height: 32px;\n  line-height: 32px;\n  background-color: #6fb3e0;\n  color: #fff;\n  font-size: 14px;\n  text-align: center;\n  border-radius: 3px;\n  cursor: pointer;\n}\n.item {\n  margin-right: 15px;\n}\n.item-block {\n  position: relative;\n  margin-bottom: 15px;\n}\n.item-block-title {\n  display: inline-block;\n  width: 120px;\n  height: 32px;\n  line-height: 32px;\n}\n.item-select {\n  width: 180px;\n  height: 24px;\n  line-height: 1;\n}\n.item input {\n  width: 15px;\n  height: 15px;\n  font-weight: normal;\n  vertical-align: middle;\n}\n", ""]);
	
	// exports


/***/ },

/***/ 406:
/***/ function(module, exports) {

	module.exports = "<div class=\"data-form\">\r\n    <div class=\"form-header\">\r\n        <strong>添加我的行业</span>\r\n    </div>\r\n    <div class=\"form-body\">\r\n        <form action=\"/Nakri/trade/saveCustTrade\" method=\"post\" id=\"mainForm\" v-el=\"mainform\">\r\n            <div class=\"item-block\">\r\n                <span class=\"item-block-title\">商家名称：</span>\r\n                <span class=\"item-block-content\">\r\n                    {{ companyName }}\r\n                </span>\r\n            </div>\r\n            <div class=\"item-block\">\r\n                <span class=\"item-block-title\">自身行业：</span>\r\n                <span class=\"item-block-content\">\r\n                    <select class=\"item-select\" @change=\"getIndustry\" v-model=\"tradeId\">\r\n                        <option value=\"-1\">请选择</option>\r\n                        <option value=\"2\">杀猪的</option>\r\n                    </select>\r\n                </span>\r\n            </div>\r\n            <div class=\"item-block\">\r\n                <span class=\"item-block-title\">上游行业：</span>\r\n                <span class=\"item-block-content\" v-if=\"tradeGraphUps.length > 0\">\r\n                    <span class=\"item\" v-for=\"(index, item) in tradeGraphUps\">\r\n                        <input type=\"checkbox\" id=\"up{{index}}\" value=\"{{ item.id }}\" v-model=\"upTrades\">\r\n                        <label for=\"up{{index}}\">{{ item.name }}</label>\r\n                    </span>\r\n                </span>\r\n                <span class=\"item-block-content\" v-else>\r\n                    暂无\r\n                </span>\r\n            </div>\r\n            <div class=\"item-block\">\r\n                <span class=\"item-block-title\">下游行业：</span>\r\n                <span class=\"item-block-content\" v-if=\"tradeGraphDowns.length > 0\">\r\n                    <span class=\"item\" v-for=\"(index, item) in tradeGraphDowns\">\r\n                        <input type=\"checkbox\" id=\"down{{index}}\" value=\"{{ item.id }}\" v-model=\"downTrades\">\r\n                        <label for=\"down{{ index }}\">{{ item.name }}</label>\r\n                    </span>\r\n                </span>\r\n                <span class=\"item-block-content\" v-else>\r\n                    暂无\r\n                </span>\r\n            </div>\r\n            <div class=\"item-btns\">\r\n                <a @click=\"saveForm\" class=\"form-btn\">保 存</a>\r\n            </div>\r\n        </form>\r\n    </div>\r\n</div>";

/***/ },

/***/ 407:
/***/ function(module, exports, __webpack_require__) {

	/* WEBPACK VAR INJECTION */(function($) {'use strict';
	
	Object.defineProperty(exports, "__esModule", {
	    value: true
	});
	/**
	 * @file 通用的函数类
	 *
	 * @author fengchaoning@baidu.com
	 */
	exports.default = {
	    alert: function alert(msg, fn) {
	        var tpl = '\n            <div id="__permission_alert" class="__permission-alert">\n                <div class="__alert-header">\n                    <h3>\u7CFB\u7EDF\u63D0\u793A</h3>\n                </div>\n                <div class="__alert-body">\n                    <span>' + msg + '</span>\n                </div>\n                <div class="__alert-btns">\n                    <a id="__permission_btn" class="__permission_btn" href="javascript:;">\u786E\u5B9A</a>\n                </div>\n            </div>\n            <div class="mask" id="mask"></div>\n            ';
	
	        $(document.body).append(tpl);
	        this.bindEvent(fn);
	    },
	    loading: function loading() {
	        var tpl = '\n            <div __floater-loading>\n                <span>\u6B63\u5728\u52AA\u529B\u7684\u52A0\u8F7D\u4E2D...</span>\n            </div>\n            <div class="mask" id="mask"></div>\n        ';
	        $(document.body).append(tpl);
	    },
	    bindEvent: function bindEvent(fn) {
	        $('#__permission_btn').on('click', function () {
	            fn && fn();
	            $('#__permission_alert, #mask').remove();
	        });
	    }
	};
	/* WEBPACK VAR INJECTION */}.call(exports, __webpack_require__(2)))

/***/ }

});
//# sourceMappingURL=3.3.js.map