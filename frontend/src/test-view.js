import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class TestView extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="margin" style="height: 100%; justify-content: center; align-items: center;">
 <vaadin-horizontal-layout style="flex-shrink: 0; justify-content: space-evenly; width:500px;">
  <vaadin-text-field class="full-width" value="" required id="vaadinTextField" style="flex-shrink: 0; flex-grow: 0;width:300px" minlength="" placeholder="Имя" has-value></vaadin-text-field>
  <vaadin-button theme="primary" id="vaadinButton" style="flex-grow: 0; flex-shrink: 0;">
    Привет! 
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'test-view';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(TestView.is, TestView);
